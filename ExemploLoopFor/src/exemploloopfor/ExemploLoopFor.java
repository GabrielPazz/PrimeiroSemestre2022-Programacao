
package exemploloopfor;

import java.util.Scanner;


public class ExemploLoopFor {

    
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um número");
            int n = teclado.nextInt();
            if (n % 2 == 0) {
                System.out.println("É par!"); 
            } else {
                System.out.println("É ímpar!");
            }
        }
    }
    }
