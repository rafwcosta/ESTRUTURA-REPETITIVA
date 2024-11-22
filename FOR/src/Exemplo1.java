import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i = i + 1 /*ou i++*/ ) {

            int x = sc.nextInt();
            soma = soma + x;

        }

        System.out.println(soma);

        sc.close();

    }
}