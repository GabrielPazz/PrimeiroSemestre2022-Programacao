package teste.prova;

import java.util.Scanner;

public class TesteProva {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int corredorA;
        int corredorB;

        System.out.println("=======================");
        System.out.println("=====Corrida prova=====");
        System.out.println("=======================\n");
        System.out.println("Digite um valor inteiro e positivo para a volta do corredor A: ");
        corredorA = entrada.nextInt();
        System.out.println("Agora digite mais um valor inteiro para a volta do corredor B: ");
        corredorB = entrada.nextInt();

        if (corredorA >= 1 && corredorB >= 1) {
            System.out.println("O tempo mínimo para que os dois cruzem a linha de chegada é de: " + (corredorA - corredorB) + " segundos.");

        } else {
            System.out.println("Os valores não podem ser utilizados, tente novamente.");
        }
    }

}
