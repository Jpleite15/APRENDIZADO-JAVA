
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//
//Fórmula da área: area = π . raio2
//
//Considere o valor de π = 3.14159

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" digite o valor  do raio : ");
        double x;
        double y;
        x = sc.nextDouble();
        y = Math.pow(x,2)*3.14159;
        System.out.printf("A area do circulo e : %.4f",y );






    }
}
