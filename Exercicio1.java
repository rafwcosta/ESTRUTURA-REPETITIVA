import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.print("Senha incorreta! Digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();

    }
}