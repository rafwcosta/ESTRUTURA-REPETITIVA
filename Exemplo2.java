import java.util.Scanner;
import java.util.Locale;

public class Exemplo2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor: ");
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma = soma + x;
            System.out.print("Digite um valor: ");
            x = sc.nextInt();
        }

        System.out.println("A soma dos valores digitados são: " + soma);

        sc.close();

    }
}