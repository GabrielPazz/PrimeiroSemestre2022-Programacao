package exerciciovetor;

import java.util.Scanner;


public class ExercicioVetor {

    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        int[] numeros= new int[10];
        for(int i =0;i < numeros.length; i++){
        System.out.println("Digite um número: ");
        numeros[i]= teclado.nextInt();
        numeros [i]= numeros[i]*2;
            System.out.println(numeros[i]);
        }
        
    }
    
}
