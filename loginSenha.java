package loginSenha;

import java.util.Scanner;

public class loginSenha {
    public static void main(String[] args) {
         String[][] usuarios = {{"usuario1", "senha1"}, {"usuario2", "senha2"}, {"usuario3", "senha3"}};

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

      
        if (verificarCredenciais(usuarios, nomeUsuario, senha)) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + nomeUsuario + ".");
        } else {
            System.out.println("Credenciais inválidas. Tente novamente.");
        }
    }

   
    private static boolean verificarCredenciais(String[][] usuarios, String nomeUsuario, String senha) {
        for (String[] usuario : usuarios) {
            if (usuario[0].equals(nomeUsuario) && usuario[1].equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
    

