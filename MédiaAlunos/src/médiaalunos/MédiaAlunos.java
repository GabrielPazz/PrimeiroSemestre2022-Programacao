package MédiaAlunos;

import java.util.Scanner;


public class MédiaAlunos {

    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      ClasseAlunos media = new ClasseAlunos();
        System.out.println("Digite a nota 1");
        media.a1 = in.nextFloat();
        System.out.println("Digite a nota 2");
        media.a2 = in.nextFloat();
        System.out.println("Digite a nota 3");
        media.a3 = in.nextFloat();
        
        media.imprimir();
        System.out.println("A média foi: "+media.calcularMedia());
        if(media.status()){
            System.out.println("Seu desgramado, você está aprovado!!");
        }
        else{
            System.out.println("Seu burro, você foi reprovado!");
        }
    }
    
}