import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        int cont = 1;
        while (cont <= 10) {
            System.out.print("Insira a nota do aluno #" + cont+ ": ");
            double nota = input.nextDouble();
            total += nota;
            cont++;
        }
        System.out.printf("Class Average: " + (total / 10) + "%n");
        
        input.close();
    }
}
