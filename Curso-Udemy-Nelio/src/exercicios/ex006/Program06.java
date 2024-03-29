package exercicios.ex006;

import java.util.Scanner;
import exercicios.ex006.entities_06.Employeer;

public class Program06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employeer employeer = new Employeer();
        System.out.print("Name: ");
        employeer.nome = sc.nextLine();
        System.out.print("Gross salary: ");
        employeer.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employeer.tax = sc.nextDouble();
        System.out.println(employeer);
        System.out.println();

        System.out.print("Which percentage to increase salary; ");
        double percentage = sc.nextDouble();
        employeer.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employeer);
        
        sc.close();
    }
}
