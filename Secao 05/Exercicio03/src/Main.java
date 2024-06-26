import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" digite um numero :");
        int A = sc.nextInt();
        System.out.println("digite outro numero");
        int B = sc.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println(" sao multiplos ");

        } else {
            System.out.println(" nao sao multiplos ");

        }
    }
}

