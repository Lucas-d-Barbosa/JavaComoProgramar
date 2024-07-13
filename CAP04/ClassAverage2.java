import java.util.Scanner;

public class ClassAverage2 {
    public static void main(String[] args) {
        int total = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter with grade of studant or -1 to quit: ");
            int nota = sc.nextInt();
            if(nota == -1) 
                break;
            total += nota;
            cont += 1;
        }
        double average = cont == 0 ? 0.0 : (double) total / cont;
        System.out.printf("Class Average: %.2f!%n", 
            average);
        sc.close();
    }
}
