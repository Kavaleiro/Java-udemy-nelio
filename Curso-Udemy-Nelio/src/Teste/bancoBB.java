package Teste;

public class bancoBB {

    private String nome;
    private int numero;
    private double saldo;

    public bancoBB(){
    }

    public bancoBB(String nome, int numero, double valor){
        this.nome = nome;
        this.numero = numero;
        deposito(valor);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }
    //Controle de Deposito e saque.
    public void deposito(double valor){
        this.saldo+=valor;
    }
    public void saque(double valor){
        this.saldo-=valor;
    }

    public String toString(){
        return "NOME: "+ nome
        + "; CONTA: "+ numero
        + "; SALDO: R$"+ String.format("%.2f", saldo);
    }
}