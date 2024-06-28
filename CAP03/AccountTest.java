import java.util.Locale;
import java.util.Scanner;

// Criando a classe de aplicativo que usa a classe Account
public class AccountTest { // Classe Driver (Condutora)

    //Inicia o método main
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("Lucas Barbosa", 50.00);
        Account account2 = new Account("Luiz Fernando", -7.53);
        

        // Exibe o saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n", 
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", 
            account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n", depositAmount);
        account1.deposit(depositAmount);

        // Exiba os saldos
        System.out.printf("%s balance: $%.2f%n", 
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", 
            account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n", depositAmount);
        account2.deposit(depositAmount);

        // Exiba os saldos
        System.out.printf("%s balance: $%.2f%n", 
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", 
            account2.getName(), account2.getBalance());

        input.close();

    } // Fim do método main

} // Fim da classe AccountTeste
