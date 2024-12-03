import java.util.Scanner;
import java.util.Locale;

public class Funcao01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            // ENTRADAS
            System.out.println("Digite 3 números!");
            System.out.print("Valor de A: ");
            int a = sc.nextInt();
            System.out.print("Valor de B: ");
            int b = sc.nextInt();
            System.out.print("Valor de C: ");
            int c = sc.nextInt();
            System.out.println();

            // CÁLCULOS
            int maior = max(a, b, c);

            mostrarResultado(maior);

        sc.close();

    }

    // LÓGICA DOS CÁLCULOS
    public static int max(int x, int y, int z) {

        int aux;

        if (x > y && x > z) {
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;

    }

    // SAÍDA
    public static void mostrarResultado(int valor) {

        System.out.println("Maior: " + valor);

    }
    
}