package exercicios.ex006.entities_06;

public class Employeer {

    public String nome;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * (percentage/100) ;
    }


    public String toString(){
        return nome 
        + ",  $"+ String.format("%.2f", netSalary());
    }
    
}