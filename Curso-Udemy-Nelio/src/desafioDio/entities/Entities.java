package desafioDio.entities;

public class Entities {
    
    private String nome;
    private Integer conta;
    private Double saldo;

    public Entities(){}
    public Entities(String nome, Integer conta, Double saldo){
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public Integer getConta(){
        return conta;
    }
    public Double getSaldo(){
        return saldo;
    }
    //Controle de Deposito e Saque.
    public void depositar(Double valor){
        this.saldo+=valor;
    }
    public void saque(Double valor){
        this.saldo-=valor;
    }
    @Override
    public String toString(){
        return "NOME: " + nome.toUpperCase()
        + "; CONTA: "+ conta
        +"; SALDO: R$"+ String.format("%.2f", saldo);
    }
}
