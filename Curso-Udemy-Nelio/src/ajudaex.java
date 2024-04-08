import java.util.Scanner;

public class ajudaex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        entidades[] vect = new entidades[n]; 
        
        for(int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new entidades(name, price);
        }
        double sum = 0.0;
        for(int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f%n ", avg);


        sc.close();

    }
}