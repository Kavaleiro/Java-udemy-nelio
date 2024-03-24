package exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero INTEIRO: ");
        int X = sc.nextInt();

        for(int i=0; i<=X; i++){
            if (i % 2 !=0){
                System.out.println("Numero impar: "+ i);    
            }
        }
        sc.close();
    }
    
}
