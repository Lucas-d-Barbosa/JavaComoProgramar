// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor
public class Account {
    private String name; // Criação da variável de instância
    private double balance; // Criação da variável de instância

    public Account(String name, double balance){
        this.name = name;

        if(balance > 0.0) // Se o saldo for positivo...
            this.balance = balance; //...Modifique a variável de instância com o saldo passado
    }
    // Método para configurar a variável
    public void setName(String name){ 
        this.name = name; // Recebe um valor e o armazena na variável
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0) // Se o saldo for positivo...
            this.balance += depositAmount; //...adicione a variável de instância com o saldo passado
    }
    
    // Método para obter o valor da variável
    public String getName(){
        return this.name; // Retorna o valor da variável para seu chamador
    }
    
    // Método para obter o valor da variável
    public double getBalance(){
        return this.balance;
    }

    public void withdral(double amount){
        this.balance = this.balance >= amount ? this.balance - amount : this.balance;
    }
    
     
} // Fim da classe