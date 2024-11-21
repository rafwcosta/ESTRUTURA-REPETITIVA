package src;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Algoritmo para ler coordenadas!.");
        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();
        System.out.print("Agora, digite o valor de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("1° quadrante!");
            }
            else if (x < 0 && y > 0) {
                System.out.println("2° quadrante!");
            }
            else if (x < 0 && y < 0) {
                System.out.println("3° quadrante!");
            }
            else {
                System.out.println("4° quadrante!");
            }

            System.out.print("Digite o valor de X: ");
            x = sc.nextInt();
            System.out.print("Agora, digite o valor de Y: ");
            y = sc.nextInt();

        }

        sc.close();

    }
}