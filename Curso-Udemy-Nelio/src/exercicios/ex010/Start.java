package exercicios.ex010;

import java.util.Scanner;
import exercicios.ex010.entidades.program;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce irá digitar: ");
        int x = sc.nextInt();
        program[] vect = new program[x];

        for(int i=0; i<vect.length; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            vect[i] = new program(numero);
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i=0; i<vect.length; i++){
            if (vect[i].getNumero() < 0) {
                System.out.println(vect[i].getNumero());
            }
        }
        sc.close();
    }
}
