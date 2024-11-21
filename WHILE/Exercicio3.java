import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Qual o tipo de combustível?");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Encerrar");
        System.out.print("Resposta: ");
        int combustivel = sc.nextInt();

        while (combustivel != 4) {

            if (combustivel == 1) {
				alcool = alcool + 1;
			}
			else if (combustivel == 2) {
				gasolina = gasolina + 1;
			}
			else if (combustivel == 3) {
				diesel = diesel + 1;
			}

            System.out.println();
            System.out.println("Qual o tipo de combustível?");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Encerrar");
            System.out.print("Resposta: ");
            combustivel = sc.nextInt();
       
        }

        System.out.println();
        System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

        sc.close();

    }
}