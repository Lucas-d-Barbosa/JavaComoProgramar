import java.util.Scanner; // Importando o Scanner

//Compara dois inteiros usando instruções if, operadores relacionais
// e operadores de igualdade.

public class Comparasion { //Inicia a class Comparasion
    
    //Inicia o método main
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in); // Cria uma variável do tipo Scanner;
       
        int number1; // Cria uma variável para o primeiro número
        int number2; // Cria uma variável para o segundo número

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if(number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        
        if(number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if(number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if(number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if(number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

        input.close();
    }  //Finaliza o método main

} //Termina a class Comparasion
