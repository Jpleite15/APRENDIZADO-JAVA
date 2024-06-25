import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        double c;
        double d;
        System.out.println(" informe  o numero do funcionario : ");
        a = sc.nextInt();
        System.out.println(" informe o total de horas trabalhadas : ");
        b= sc.nextInt();
        System.out.println("informe o valor por hora de trabalho : ");
        c=sc.nextDouble();
        d= b*c;
        System.out.println("numero do funcionario : " +a);
        System.out.printf(" o salario do funcionario " + a + " e de %.2f",d );

    }
}
