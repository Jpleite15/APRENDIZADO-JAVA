import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("que horas o jogo começou ? ");
        int I= sc.nextInt();
        System.out.println(" que horas acabou o jogo ?");
        int F = sc.nextInt();
        int D;
        if (I<F){
            D = F-I;
        }
        else {
            D = 24- I+F;
        }
        System.out.println(" o jogo durou " + D + "hora(s) ");
    }
}
