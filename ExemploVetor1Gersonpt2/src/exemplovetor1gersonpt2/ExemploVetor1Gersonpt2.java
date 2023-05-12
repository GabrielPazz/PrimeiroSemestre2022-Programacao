
package exemplovetor1gersonpt2;


import java.util.Scanner;

public class ExemploVetor1Gersonpt2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //O usuário determina o tamanho do array
        System.out.println("Digite o tamanho do vetor: ");
        int n = teclado.nextInt();
        int[] idade = new int[n];
        
        //Entra com as idades
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade:");
            idade[i]=teclado.nextInt();
        }
        
        //Exibe todas as idades de uma vez
        for(int i = 0; i < idade.length; i++){
            System.out.println("idade["+i+"]="+idade[i]);
        }
    }
}
