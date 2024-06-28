import java.util.Scanner; // Importando um recurso para ler dados do usuário
// Programa de adição que insere dois números, então exibe a soma deles

public class Addition{ // Abertura da class Addition
    
    // Inicialização do método main
    public static void main(String[] args){

        // Criação do Scanner para ler os dados digitados pelo usuário
        Scanner input = new Scanner(System.in); 

        int number1; // Criação de uma área da memória para o primeiro número
        int number2; // Criação de uma área da memória para o segundo número
        int sum; // Criação de uma área da memória para a soma dos dois números

        System.out.print("Enter first integer: ");
        number1 = input.nextInt(); // Colocando o número digitado na variável number1

        System.out.print("Enter second integer: ");
        number2= input.nextInt(); // Colocando o número digitado na variável number2

        sum = number1 + number2; // Soma dos dois números é armazenada na variável sum

        System.out.printf("Sum is %d.%n", sum);

        input.close();
    } // Fechamento do método main

} // Fechamento da class Addition
