package exercicios;

import java.util.Scanner;

/**Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa */
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2,s;

        System.out.println("Digite o 1 valor: ");
        v1 = sc.nextInt();
        System.out.println("Digite o 2 valor: ");
        v2 = sc.nextInt();
        s = v1 + v2;
        System.out.println("O resutlado é: "+ s);

        sc.close();
    }
}
