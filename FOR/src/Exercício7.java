import java.util.Scanner;
import java.util.Locale;

public class Exercício7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor positivo N: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();

    }
}