package alturMax;

import java.util.Scanner;

public class altMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma;
        System.out.println("Digite primeiro número :");
        int A = scanner.nextInt();
        System.out.println("Digite segundo número :");
        int B = scanner.nextInt();
        System.out.println("Digite terceiro número :");
        int C = scanner.nextInt();

        soma = A*B*C;
        if (scanner.hasNextInt()) {
           
            System.out.println("A altura maxima dos numeros é " + soma );
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
        scanner.close();
        
    }
}
