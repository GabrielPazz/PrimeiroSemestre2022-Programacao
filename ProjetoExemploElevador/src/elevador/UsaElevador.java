
package elevador;

import java.util.Scanner;

/*
Elabore um projeto Java que declare uma classe Elevador, com os 
atributos: marca (String), passageiros (int), carga (double),
maxPassageiros (int) e maxCarga (double). Faça os métodos get/set 
para todos os atributos, exceto para maxPassageiros, maxCarga.
Crie uma regra para atribuir passageiros e carga dentro do limite.
Escreva uma classe principal para testar os recursos definidos na 
classe Elevador.

*/

public class UsaElevador {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        String marca= teclado.nextLine();
        System.out.println("Digite a carga máxima: ");
        double maxCarga= teclado.nextDouble();
        System.out.println("Digite o máximo de passageiros: ");
        int maxPassageiros= teclado.nextInt();

//Instanciar a classe elevador - É criar um objeto do tipo elevador 
        Elevador elevador=new Elevador(marca, maxCarga, maxPassageiros);
        elevador.setPassageiros(-3);
        System.out.println("Marca: " + elevador.getMarca() );
        System.out.println("Máximo de carga= "+elevador.getmaxCarga());
        System.out.println("Máximo de passageiros= "+elevador.maxPassageiros());
        System.out.println("Passageiros= " + elevador.getPassageiros());
        System.out.println("Carga= " + elevador.getCarga());
    }
    
   
    
}
