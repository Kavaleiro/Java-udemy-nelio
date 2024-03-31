package exercicios.ex008;

import java.util.Scanner;

public class ex08ap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        CurrentConverse.value  = sc.nextDouble();
        System.out.print("How many dollars wil be bought: ");
        CurrentConverse.valueConvert = sc.nextDouble();
        
        System.out.printf("Amount to bepaid in reais = R$%.2f%n",CurrentConverse.IFO());



        sc.close();
    }
}
