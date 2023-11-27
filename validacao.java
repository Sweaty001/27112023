package valiNum;

import java.util.Scanner;

public class validacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");

       
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            System.out.println("Você digitou um número inteiro válido: " + numero);
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}

    

