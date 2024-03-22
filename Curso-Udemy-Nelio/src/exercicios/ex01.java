package exercicios;

public class ex01 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 4100.0;
        double measure = 53.123123;

        System.out.printf(" Products:%n %s, which price is $%.1f%n %s, which price is $%.1f%n", product1,price1, product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("Measue whith eigth decimal places: %.8f%nRouded(three decimal places): %.3f%nUS decimal point: %.2f%n", measure,measure,measure);
    }
    
}
