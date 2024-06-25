import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int df;
        System.out.println("digite um numero : ");
        a = sc.nextInt();
        System.out.println("digite outro numero: ");
        b= sc.nextInt();
        System.out.println("digite mais um numero: ");
        c= sc.nextInt();
        System.out.println("digite o ultimo numero : ");
        d= sc.nextInt();
        df= (a*b-c*d);
        System.out.println("a diferenca dos produtos e : "+df);


    }
}
