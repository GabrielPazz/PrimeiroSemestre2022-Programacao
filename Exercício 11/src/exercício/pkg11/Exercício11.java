package exercício.pkg11;
import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1;
        float n2;
        float resultado;
        char Operacao;
        boolean flag = true;
        System.out.println("=========================");
        System.out.println("=====CALCULATOR 3000=====");
        System.out.println("=========================\n");
        System.out.println("Digite um número : ");
        n1 = entrada.nextFloat();
        System.out.println("Digite outro valor:  ");
        n2 = entrada.nextFloat();
        System.out.println("Escolha um tipo de operação:(+) ADIÇÃO  (-)SUBTRAÇÃO  (*)MULTIPLICAÇÃO (/)DIVISÃO  (&)MÓDULO ");
        Operacao = entrada.next() .charAt (0);
         
        if(Operacao == '+'){ resultado = n1 + n2 ;
            System.out.println("O resultado da operação é: " + resultado);}
        else if (Operacao == '-') { resultado = n1 - n2;
            System.out.println("O resultado da operação é: "+ resultado);}
        else if (Operacao == '*') { resultado = n1 * n2;
            System.out.println("O resultado da operação é: "+ resultado);}
        else if (Operacao == '/'){ resultado = n1 / n2; if( n2 == 0){ System.out.println("Ae otário, escolhe outro número mané :/"); flag = false;} else{
            System.out.println("O resultado da operação é: "+ resultado);}}
        else if (Operacao == '%'){ resultado = n1 % n2;
            System.out.println("O resultado da operação é: " + resultado); if ( n2==0){ System.out.println("Não utilize essa condição!");} flag = false;}
        else { System.out.println(" NÃO SABE LER NÃO? Muda a operação de novo ai rapa(_) "); }
        
        
    }
    
}