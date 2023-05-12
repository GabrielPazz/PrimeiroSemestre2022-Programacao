
package exerciciovetorpt2;

import java.util.Scanner;

/*
 Elabore um algoritmo em Java que declare um array de 10 
 nomes que será digitado via teclado.
 Ao exibir, converta os nomes para letras maiúsculas
*/


public class ExercicioVetorpt2 {

    
    public static void main(String[] args) {
        String[] listaNomes = new String[10];
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i<listaNomes.length;i++){
        System.out.println("Digite o nome: ");
        listaNomes[i] = teclado.nextLine();
            System.out.println(listaNomes[i].toUpperCase());
    }
    }
    
}
