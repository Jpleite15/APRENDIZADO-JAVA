import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String product1 = "Computer";
        String product2 = "Office Desck";
        int age = 30;
        int code = 5230;
        char gender = 'f';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.println("products ");
        System.out.println(product1 + ",which price is " + price1);
        System.out.println(product2 + ",which price is "  + price2);
        System.out.println("Record:" + age + " years old ,code " + code + " and gender:" + gender);
        System.out.println("Measure with eigth decimal places :" + measure);
        System.out.printf("Rouded ( three decimal places): %.3f%n", measure);


    }
}
