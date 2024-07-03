import javax.swing.JOptionPane;

public class SumJOptionPane {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter with the first number:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter with the second number:"));
        int sum = num1 + num2;
        String message = String.format("The result of sum is: %d"
            ,sum);
        JOptionPane.showMessageDialog(null, message);
    }   
}
