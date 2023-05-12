
package agrupamentovetores;
import java.util.Scanner;

public class AgrupamentoVetores {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       
       int a[] = new int [4];
       int b[] = new int [7];
       int c[] = new int [11];
       
      for ( int i = 0; i< a.length; i ++){
        System.out.println("Digite um valor para o Vetor A: ");
        a[i] = entrada.nextInt();
       }
      for (int i = 0; i< b.length;i++){
        System.out.println("*************");
        System.out.println("*Inserindo os valores do Vetor B: *");
        b[i] = entrada.nextInt();
    }
    for (int i =0; i<c.length;i++){
    if (i<a.length){
    c[i]= a[i];
    }
    else{
    c[i]= b[i-a.length];
    }
    }
        System.out.println("Valores agrupados no vetor C: ");
        for (int i =0;i<c.length; i++){
            System.out.println(c[i]+" ");
        
        } 
    }
    
}
