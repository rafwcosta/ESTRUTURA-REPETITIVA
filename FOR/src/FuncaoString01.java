import java.util.Scanner;
import java.util.Locale;

public class FuncaoString01 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
            // ENTRADA DE DADOS
            String original = "abcde  FGHIJ  ABC  abc  DEFG  "; // STRING ORIGINAL, SEM ALTERAÇÕES
            String s01 = original.toLowerCase(); // TRANSFORMA TODOS OS CARACTERES EM LETRAS MINÚSCULAS
            String s02 = original.toUpperCase(); // TRANSFORMA TODOS OS CARACTERE EM LETRAS MAIÚSCULAS
            String s03 = original.trim(); // TIRA OS ESPAÇOS EM BRANCO
            String s04 = original.substring(2); // PEGAR SOMENTE O CARACTERE DA POSIÇÃO 2 EM DIANTE, E MONTAR UMA NOVA STRING
            String s05 = original.substring(2, 9); // VAI RECORTAR O STRING A PARTIR DO 2, SÓ QUE ABAIXO DO CARACTERE 9
            String s06 = original.replace('a', 'x'); // SEMPRE QUE TIVER UM CARACTERE "a", TROCAR POR "x"
            int i = original.indexOf("bc");
            int j = original.lastIndexOf("bc");

            // SAÍDA DE DADOS
            System.out.println();
            System.out.println("Original: -" + original + "-");
            System.out.println();
            System.out.println("toLowerCase: -" + s01 + "-");
            System.out.println();
            System.out.println("toUpperCase: -" + s02 + "-");
            System.out.println();
            System.out.println("trim: -" + s03 + "-");
            System.out.println();
            System.out.println("substring(2): -" + s04 + "-");
            System.out.println();
            System.out.println("substring(2, 9): -" + s05 + "-");
            System.out.println();
            System.out.println("Replace('a', 'x'): " + s06 + "-");
            System.out.println();
            System.out.println("Index of 'bc': " + i);
            System.out.println();
            System.out.println("Last index of 'bc': " + j);
            System.out.println();

        sc.close();

    }   
}