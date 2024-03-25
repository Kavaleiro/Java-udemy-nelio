public class tipoString {
    public static void main(String[] args) {
        String original = "abcd FGHI";
        String [] vect = original.split(" ");

        String s01 = original.toUpperCase();
        String s02 = original.toLowerCase();
        String s03 = original.trim();/**ELIMINA OS ESPACOS NOS CANTOS */
        String s04 = original.substring(2);//* monta um string a partir da posicao */
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');//Trocado 'a' por 'x'
        String s07 = original.replace("abc", "xy");
        int j = original.indexOf("bc");
        int k = original.lastIndexOf("bc");


        System.out.println(vect[0]);
        System.out.println(vect[1]);

        System.out.println("=====INICIO=====");
        System.out.println("s01 =="+s01);
        System.out.println("s02=="+s02+"    -");
        System.out.println("s02=="+s03+"    -");
        System.out.println("s04"+s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(j);
        System.out.println(k);



        System.out.println("=====FIM=====");
    }
    
}
