
package cadastraraluno;

import java.util.Scanner;


public class CadastrarAluno {

    
    public static void main(String[] args) {
       //Criar um objeto
       Scanner teclado = new Scanner(System.in);
       Aluno a1= new Aluno();
       a1.nome= "Gerson";
       a1.curso= "TADS";
       a1.ra=12345;
        System.out.println("Digite o semestre: ");
       a1.setSemestre(teclado.nextInt());
        System.out.println("Semestre digitado foi: "+a1.getSemestre());
       
       teclado.close();
    }
}
