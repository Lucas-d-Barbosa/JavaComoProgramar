// Realizar o produto de três números
import java.util.Scanner; // Importando a classe Scanner

public class Product { // Iniciando a class Product

    // Iniciando o método main
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // Criando um objeto da class Scanner 

        int x;
        int y;
        int z;
        int resul;

        System.out.print("Enter first number: ");
        x = input.nextInt();

        System.out.print("Enter second number: ");
        y = input.nextInt();

        System.out.print("Enter third number: ");
        z = input.nextInt();

        resul = x * y * z;

        System.out.printf("Product is: %d!%n", resul);

        input.close();
    } // Fechando o método main
    
} // Fechando a class Product
