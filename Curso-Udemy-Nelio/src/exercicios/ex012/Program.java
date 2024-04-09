package exercicios.ex012;

import java.util.Scanner;

import exercicios.ex012.entids.Rent;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            System.out.println();
            System.out.println("Rent #"+ i + ":");
            System.out.print("NAME: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("EMAIL: ");
            String email = sc.next();
            System.out.print("ROOM: ");
            int roomNumber = sc.nextInt();
            
            //Rent rent = new Rent(name, name); <--Uma alternativa
            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i=0; i<10; i++){
            if(vect[i] != null){
                System.out.println(i+ " : "+ vect[i]);
            }
        }

        sc.close();
    }
    
}
