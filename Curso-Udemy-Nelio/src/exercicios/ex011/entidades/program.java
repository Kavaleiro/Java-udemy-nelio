package exercicios.ex011.entidades;

public class program {
    
    private String name;
    private int age;
    private double altura;

    public program(String name, int age, double altura){
        this.name = name ;
        this.age = age;
        this.altura = altura;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    
}
