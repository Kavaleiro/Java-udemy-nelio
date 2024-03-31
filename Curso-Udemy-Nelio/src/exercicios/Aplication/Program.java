package exercicios.Aplication;

import java.util.Scanner;

import exercicios.Aplication.entities.Products;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Products product = new Products(name, price);

        product.setName("Computador ");
        System.out.println("Upadated name: "+ product.getName());
        product.setPrice(1200.0);
        System.out.println("Upadated data: "+ product.getPrice());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        
        sc.close();
    }
}
