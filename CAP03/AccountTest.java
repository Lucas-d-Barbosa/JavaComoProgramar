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
        System.out.print(viewAccounts(account1, account2));

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n", depositAmount);
        account1.deposit(depositAmount);

        // Exiba os saldos
        System.out.print(viewAccounts(account1, account2));

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n", depositAmount);
        account2.deposit(depositAmount);

        // Exiba os saldos
        System.out.println(viewAccounts(account1, account2));

        // Faz um saque nas duas contas
        account1.withdral(20);
        account2.withdral(45.23);

         // Exiba os saldos
         System.out.print(viewAccounts(account1, account2));

        input.close();

    } // Fim do método main



    // Criação do método viewAccounts
    public static String viewAccounts(Account ac1, Account ac2){
        return String.format("%s balance: $%.2f %n%s balance: $%.2f %n", 
            ac1.getName(), ac1.getBalance(), 
            ac2.getName(), ac2.getBalance());
    }// Fim do método viewAccounts
} // Fim da classe AccountTeste
