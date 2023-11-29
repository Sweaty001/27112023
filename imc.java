package IMC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class imc{
    public static void main(String[] args) {
        try{
            Double gravidade = 9.81;
            Scanner scnPeso = new Scanner(System.in);
            System.out.println("Digite seu peso");
            double peso = scnPeso.nextDouble();

            Scanner scnAltura = new Scanner(System.in);
            System.out.println("Digite sua altura em metros");
            double altura = scnAltura.nextDouble();

            System.out.println("Seu IMC (Peso / (Altura * Altura))  (" + peso + "/ ("+ altura + " * " +
            altura + ")) " + " [" + altura + " * " + altura + " = " + (altura * altura) + "] " + (peso / (altura * altura)));
            scnPeso.close();
            scnAltura.close();
        } catch (InputMismatchException e) {
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
    }
}
