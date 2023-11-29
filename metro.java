package METRO;

import java.util.Scanner;

public class metro {
    public static void main(String[] args) {
        try{
        Scanner scnAltura = new Scanner(System.in);
        System.out.println("Digite a altura");
        double altura = scnAltura.nextDouble();

        Scanner scnLargura = new Scanner(System.in);
        System.out.println("Digite a largura");
        double largura = scnLargura.nextDouble();

        System.out.println("O metro quadrado é de " + (largura * altura));

        scnAltura.close();
        scnLargura.close();
    } catch (Exception e){
        System.out.println("Ops! Ocooreu o erro" + e);
    }
}
}