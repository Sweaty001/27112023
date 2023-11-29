package soma;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = 5, x = 3, soma;
        soma = y+x;

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            System.out.println("Soma dos dois numeros é: " + soma);
        } else {
            System.out.println("Soma invalida. ");
        }


    
    }
    
}
