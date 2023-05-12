
package triplodovetora;
import java.util.Scanner;

public class TriploDoVetorA {

    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        int VetorA[] = new int[8];
        int VetorB[] = new int[8];
        
       
        for(int i=0; i<VetorA.length;i++){
            System.out.println("Digite uma valor para o Vetor A: ");
            VetorA[i]= entrada.nextInt();
            VetorB[i] = VetorA[i]*3;
           System.out.println("Vetor[B]:"+VetorB[i]) ; 
          
        }  
    }
    
}
