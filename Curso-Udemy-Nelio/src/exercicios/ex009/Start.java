package exercicios.ex009;

import java.util.Scanner;

import exercicios.ex009.Banco.Banco;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n): ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            banco = new Banco(holder, number, initialDeposit);
        }
        else{
            banco = new Banco(holder, number);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositvalue = sc.nextDouble();
        banco.deposit(depositvalue);
        System.out.println("Updatade account data: ");
        System.out.println(banco);
        
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double saqueValue = sc.nextDouble();
        banco.saque(saqueValue);
        System.out.println("Updatade account data: ");
        System.out.println(banco);
        sc.close();
    }
    
}
