import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        System.out.println(" digite o valor de a : ");
        a= sc.nextDouble();
        System.out.println("digite o valor de b : ");
        b = sc.nextDouble();
        System.out.println("digite o valor de c : ");
        c=sc.nextDouble();
        d= (a*c)/2;
        e= Math.pow(c,2)* 3.14159;
        f = ((a+b)*c)/2;
        g = b*b;
        h= a*b;
        System.out.printf(" area do triangulo : %.3f%n" , d);
        System.out.printf("area do circulo : %.3f%n ",  e);
        System.out.printf(" area do trapezio :%.3f%n " ,  f);
        System.out.printf("area do quadrado : %.3f%n" ,  g);
        System.out.printf("area do retangulo : %.3f " , h);




    }
}
