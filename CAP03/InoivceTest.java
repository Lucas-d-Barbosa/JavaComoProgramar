// Classe de execução da classe invoice 

import java.util.Locale;
import java.util.Scanner;
public class InoivceTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter with number of invoice: ");
        String number = input.nextLine();

        System.out.print("Enter with the description of invoice: ");
        String description = input.nextLine();

        System.out.print("Enter with the quantity of products: ");
        int quantity = input.nextInt();

        System.out.print("Enter with the price of product: ");
        double price = input.nextDouble();

        Invoice invoice = new Invoice(number, description, quantity, price);
        System.out.printf("%s: %s%n%d products = $%.2f%n",
            invoice.getNumber(), invoice.getDescription(),
            invoice.getQuantity(), invoice.getPrice());
        System.out.println(invoice.getInvoice());

        input.close();
    }
}
