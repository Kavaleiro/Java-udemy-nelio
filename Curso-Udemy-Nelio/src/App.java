import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        char z;
        z = sc.next().charAt(0);
        System.out.println(z);

        System.out.println("Inicio do Curso aqui!!");
        double x = 10.3547;
        System.out.println(x);
        System.out.printf("%.2f%n",x);
        String nome = "Felipe";
        int idade = 31;
        double salario = 4500.0;
        System.out.printf("%s tem %d anos e recebe R$ %.1f reais%n", nome, idade, salario);
        sc.close();
    }
}
