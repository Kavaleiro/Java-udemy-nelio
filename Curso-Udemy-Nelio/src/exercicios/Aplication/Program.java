package exercicios.Aplication;

import java.util.Scanner;

import exercicios.Aplication.entities.Products;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Products products  = new Products();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        products.name = sc.nextLine();
        System.out.println("Price: ");
        products.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        products.quantity = sc.nextInt();

        System.out.println(products.name +", "+ products.price +", "+  products.quantity);
        sc.close();
    }
}
