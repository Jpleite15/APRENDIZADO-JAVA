import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int soma ;
        System.out.print(" digite um numero: ");
        x= sc.nextInt();
        System.out.println("digite mais um numero:");
        y = sc.nextInt();
        soma = x+y ;
        System.out.println("a soma de "+x+" mais "+y+" e igual a : "+ soma);

    }
}