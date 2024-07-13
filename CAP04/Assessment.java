import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        int approved = 0;
        int disapproved = 0; 
        int i = 1;
        Scanner input = new Scanner(System.in);
        while(i <= 10){
            System.out.printf("Enter candidate result %d: ", i);
            int result = input.nextInt();
            if(result == 1){
                approved ++;
            } else{
                disapproved++;
            }
            i++;
        }
        System.out.printf("Numbers of approved: %d%n",
            approved);
        System.out.printf("Numbers of disapproved: %d%n",
            disapproved);

        if(approved >= 8)
            System.out.println("Bonus to instructor!");

        input.close();
    }
}
