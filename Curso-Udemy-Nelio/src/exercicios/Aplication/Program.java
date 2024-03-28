package exercicios.Aplication;

import java.util.Scanner;

import exercicios.Aplication.entities.Products;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Products products  = new Products();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        products.name = sc.nextLine();
        System.out.print("Price: ");
        products.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        products.quantity = sc.nextInt();

        System.out.println("Products data: "+products);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock:  ");
        int quantity = sc.nextInt();
        products.addProducts(quantity);
        System.out.println("Updated data: " + products);

        System.out.println();
        System.out.print("Enter the number to be removed from stock: ");
        quantity = sc.nextInt();
        products.removeProducts(quantity);
        System.out.println("Updated data: "+ products);



        sc.close();
    }
}
