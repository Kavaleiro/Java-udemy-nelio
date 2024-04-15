package desafioDio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafioDio.entities.Entities;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BEM-VINDO AO BANCO DIGITAL: ");

        List<Entities> list = new ArrayList<>();
        System.out.print("Quantos Clientes você deseja cadastrar: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("NOME: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("CONTA: ");
            int conta = 0001;
            while (numeroConta(list, conta)) {
                conta+=0001;
            }
            System.out.print(conta);
            System.out.println();
            System.out.print("SALDO: ");
            Double saldo = sc.nextDouble();

            Entities ent = new Entities(nome, conta, saldo);
            list.add(ent);
        }

        System.out.println("Lista de Clientes do Banco.");
        for(Entities ent: list){
            System.out.println(ent);
        }
        sc.close();
    }

    //Criando um novo número de conta.
    public static Boolean numeroConta(List<Entities> list, int conta){
        Entities ent = list.stream().filter(x -> x.getConta() == conta).findFirst().orElse(null);
        return ent !=null;
    }

    public static Integer hasConta(List<Entities> list, int conta){
        for(int i=0; i<list.size();i++){
            if(list.get(i).getConta() == conta){
                return i;
            }
        }
        return null;
        
    }
    
}
