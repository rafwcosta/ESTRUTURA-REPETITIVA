import java.util.Scanner;
import java.util.Locale;

public class ExemploDoWhile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resposta;
        do {

            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir? (s/n): ");
            
            resposta = sc.next().charAt(0);

        } while (resposta != 'n');

        sc.close();

    }
}