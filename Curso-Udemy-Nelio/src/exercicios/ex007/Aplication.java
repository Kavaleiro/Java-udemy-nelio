package exercicios.ex007;

import java.util.Scanner;

import exercicios.ex007.aluno.Aluno;

public class Aplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Name: ");
        aluno.name = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());

        if (aluno.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f PINTS %n",aluno.missing());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
    
}
