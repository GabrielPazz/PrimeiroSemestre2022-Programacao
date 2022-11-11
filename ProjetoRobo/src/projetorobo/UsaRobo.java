package projetorobo;

import java.util.Scanner;

public class UsaRobo {

    public static void main(String[] args) {
        Robo robo = new Robo();//Instanciar a classe Robo
        try (Scanner teclado = new Scanner(System.in)) {
            int resp = 1;
            while (resp == 1) {
                System.out.println("Informe a direção do robô");
                char direcao = teclado.nextLine().charAt(0);
                robo.setDirecao(direcao);
                robo.mostrarPosicaoAtual();
                System.out.println("Deseja continuar? 1-SIM"+
                        "/nOu pressione qualquer número para sair");
                resp=teclado.nextInt();
                teclado.nextLine();
            }
        }
    }

}
