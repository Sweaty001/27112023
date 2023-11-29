package matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner scsaida = new Scanner(System.in);
        String fruta;

        boolean sair = false;
        while (sair == false){
            System.out.println("Digite o nome de uma fruta");
            fruta = sc.nextLine();
            if (fruta != "") {
                frutas.add(fruta);
            } else {
                System.out.println("Digite um nome válido");
            }
                System.out.println("Deseja digitar mais algum nome de fruta");
                System.out.println("Digitar S ou s para continuar ou digiteN ou n para sair");
                String saida = sc.nextLine();
                if (saida.equals("N") || saida.equals("n")){
                    break;
                }
            }
            System.out.println("foram adicionais " + frutas.size() + "frutas, quais sejam: " + frutas);
            sc.close();
    }
}
