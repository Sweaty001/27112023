package idade;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        if(idade > 18){
            System.out.println("vc é velho dms");
        } else if (idade < 18){
            System.out.println("vc é novo");
        }
    }
}
