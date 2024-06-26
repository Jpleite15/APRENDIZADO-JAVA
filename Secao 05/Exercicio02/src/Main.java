import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("digite um nummero : ");
        x = sc.nextInt();
        if (x == 0 || x%2==0) System.out.println(" par");
        else
            System.out.println("impar");
    }
}