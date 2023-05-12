
package exercicio.pkg9;

import java.util.Scanner;
public class Exercicio9 {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informar as medidas do triângulo");
        float a=teclado.nextFloat();
        float b=teclado.nextFloat();
        float c=teclado.nextFloat();  
        if (a>0 && b>0 && c>0) {
            if(a+b>c && a+c>b && b+c>a){
                if (a==b && b==c){
                System.out.println(" Triângulo Equilátero");
                }else if(a==b || a==c || b==c){
                    System.out.println("Triângulo Isóceles");
                    
                }else {
                    System.out.println("Triângulo Escaleno");
                }
            }else{
                System.out.println("Não forma triângulo");
            }
        }else{
            System.out.println("Medidas inválidas");
        }
    }
}


    