import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i<n; i++) {

            System.out.print("Digite um valor inteiro: ");
            int x = sc.nextInt();

            if (x >= 10  && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }

        }

        System.out.println();
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();

    }
}