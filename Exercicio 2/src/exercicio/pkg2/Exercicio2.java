
package exercicio.pkg2;

import java.util.Scanner;
public class Exercicio2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numeroInteiro;
        float resultado;
        
        System.out.println("Digite um numero qualquer: ");
        numeroInteiro = entrada.nextInt();
        
        
        if (numeroInteiro>20){ 
            
            resultado = numeroInteiro/2.0f;
            System.out.println("Esse será seu resultado:  " + resultado);           
             
       }
        
        else{
            
            System.out.println("Seu valor não condiz " );
    }
    
}
}
