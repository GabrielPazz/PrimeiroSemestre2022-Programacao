package exercícios.faculdade;
//Exercício 7

import java.util.Scanner;
public class ExercíciosFaculdade {

    
    public static void main(String[] args) {
       Scanner teclado=new Scanner (System.in);
       float peso=0;
       System.out.println("Qual é a sua altura?");
       float altura =teclado.nextFloat();
       teclado.nextLine();
       System.out.println("Qual é o seu sexo?");
       char sexo=teclado.nextLine().charAt(0); 
       if(sexo=='M'|| sexo=='m'){ 
       peso=(72.7F*altura)-58;
       }
       else if(sexo=='F' || sexo=='f'){
        peso=(62.1F*altura)- 44.7F;
    }
       else { System.out.println("Desculpe, informação incorreta");
       }
       
       System.out.println ("O seu peso ideal é: " + peso );
      
       
       
       
               }
    
}
