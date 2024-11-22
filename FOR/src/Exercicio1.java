import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // ENTRADA
        System.out.print("Digite um valor inteiro: ");
        int x = sc.nextInt();

        // CÁLCULO / PROCESSAMENTO; E SAÍDA
        for (int i=1; i<x; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

        // FECHAMENTO DO CÓDIGO
        sc.close();

    }
}