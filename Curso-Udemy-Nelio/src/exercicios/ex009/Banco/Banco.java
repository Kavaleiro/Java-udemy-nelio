package exercicios.ex009.Banco;

public class Banco {
    
    private String name;
    private int conta;
    private double saldo;

    public Banco(){
    }
    public Banco(String name, int conta){
        this.name = name;
        this.conta = conta;
    }
    public Banco(String name, int conta, double initialDeposit){
        this.name = name;
        this.conta = conta;
        deposit(initialDeposit);
    }
    

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getConta(){
        return conta;
    }
  
    public double getSaldo(){
        return saldo;
    }
    
    public void deposit(double amount){
        this.saldo+=amount;
    }
    public void saque(double amount){
        this.saldo-=amount + 5.0;
    }

    public String toString(){
        return "Account: " + conta
        + ", Holder: " + 
        name + ", Balance: $"
        + String.format("%.2f", saldo); 
    }



}
