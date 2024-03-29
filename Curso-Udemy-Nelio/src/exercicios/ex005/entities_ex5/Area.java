package exercicios.ex005.entities_ex5;

import java.util.Scanner;

import exercicios.ex005.Rectangle;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        System.out.print("WIDTH: ");
        rectangle.width = sc.nextDouble();
        System.out.print("HEIGHT: ");
        rectangle.height = sc.nextDouble();
        System.out.println();
        System.out.println(rectangle);

        sc.close();

    }
    
}
