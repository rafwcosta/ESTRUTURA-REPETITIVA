package src;
import java.util.Scanner;
import java.util.Locale;

public class Exemplo1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da largura: ");
        double largura = sc.nextDouble();
        System.out.print("Agora, o comprimento: ");
        double comprimento = sc.nextDouble();
        System.out.print("O metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Preço: %.2f%n", preco);

        sc.close();

    }
}