package alturMax;

import java.util.Scanner;

public class altMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
       

        int altMax = 100;
        if (altura < altMax) {
           
            System.out.println("A altura máxima do pacote é valida" );
        } else {
            System.out.println("Altura maior que o permitido");
        }
        scanner.close();
        
    }
}
