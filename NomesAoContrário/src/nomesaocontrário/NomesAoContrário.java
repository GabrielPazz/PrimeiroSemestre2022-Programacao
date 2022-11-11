
package nomesaocontrário;
import java.util.Scanner;

public class NomesAoContrário {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       String Nome[] = new String[15];
       
       for  (int i = 0; i < Nome.length; i ++){
       
       System.out.println("Digite 15 nomes: ");
       Nome[i] = entrada.next();
       }
       
       for (int i =(Nome.length-1); i>=0; i --)
       
       System.out.println("Vetor ["+i+"]: "+Nome[i]);
    }
    
}
