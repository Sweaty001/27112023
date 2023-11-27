package usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class usuarios {
    public static void main(String[] args) {
        List<String> usersLogged = new ArrayList<>();
        String[] usuariosLogados = {"teste1","teste2","..."};
        usuariosLogados[3] = "teste4";
        usuariosLogados[2] = "Substituir a string ...";

       
        int limitUsers = 2;
        Scanner sc = new Scanner (System.in);
        String usuario;
        try{
            while (usersLogged.size() < limitUsers) {
                System.out.println("Digite o usuario");
                usuario = sc.nextLine();
                if (usuario != "") {
                    usersLogged.add(usuario);                   
                } else {
                    System.out.println("Digite um usuario válido" );
                }
                Thread.sleep(1000);
            }
            System.out.println("Limite de usuários excedido");
        } catch (InterruptedException e){
            System.out.println("Ops! Houve algum erro...: " + e);
        }
            sc.close();
    }
}
