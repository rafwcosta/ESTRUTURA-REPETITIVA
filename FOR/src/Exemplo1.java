import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        int soma = 0;
        for (int i=0; i<n; i++) {

            System.out.print("Digite um valor inteiro: ");
            int x = sc.nextInt();
            soma += x;

        }

        System.out.println("A soma do valores é: " + soma);

        sc.close();

    }
}