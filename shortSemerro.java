package SHORT;

import java.util.Scanner;

public class shorterro {
    public static void main(String[] args) {
        try{
                    Scanner sc = new Scanner(System.in);
                    short minhaVariavel;
                    System.out.println("Digite um número: ");
                    minhaVariavel = sc.nextShort();
                    System.out.println("Seu número é " + minhaVariavel);
                }catch (Exception e){
                    System.out.println("Ops! Ocooreu o erro" + e);
                }
            }
        }
    

