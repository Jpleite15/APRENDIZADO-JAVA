import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        double c;
        int d;
        int e;
        double f;
        double vp;
        System.out.println(" informe o codigo do produto : ");
        a= sc.nextInt();
        System.out.println("informe a quantitade deste produto:");
        b=sc.nextInt();
        System.out.println("informe o valor deste produto :");
        c=sc.nextDouble();
        System.out.println("informe o codigo do outro produto :");
        d=sc.nextInt();
        System.out.println("informe a quantitade deste produto :");
        e=sc.nextInt();
        System.out.println("informe o valor deste produto :");
        f=sc.nextDouble();
        vp=( b*c+e*f);
        System.out.printf("valor a pagar : %.2f" , vp);

    }
}
