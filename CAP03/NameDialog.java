import javax.swing.JOptionPane;

public class NameDialog { // Incia a classe NameDialog
    public static void main(String[] args) { // Inicia o método main
        // Pede para o usuário digitar seu nome
        String name = JOptionPane.showInputDialog(null, "Digite seu nome: ");

        // Cria uma mensagem formatada com o nome do usuário. 
        String message = 
            String.format("Welcome, %s,  to java Programming!%n",name);

        // Exibe a mensagem formatada em uma caixa de diálogo.    
        JOptionPane.showMessageDialog(null, message);   
    } // Fecha o método main
} // Fecha a classe 
