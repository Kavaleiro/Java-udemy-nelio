package Teste;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bancoBB banco;

        System.out.print("Digite seu numero: ");
        int numero = sc.nextInt();
        System.out.print("Digite o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Valor de Deposito: ");
        double valor = sc.nextDouble();
        banco = new bancoBB(nome, numero, valor);

        System.out.println(": "+ banco);

        System.out.print("Valor de saque: ");
        valor = sc.nextDouble();
        banco.saque(valor);

        System.out.println(banco);

        sc.close();

    }
    
}
