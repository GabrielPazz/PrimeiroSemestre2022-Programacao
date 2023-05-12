package testeprova4;

import java.util.Scanner;

public class TesteProva4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vagoes = new int[6];
        int l = 0;
        for (int z = 0; z < vagoes.length; z++) {
            System.out.println("Digite uma quantidade de passageiros por vagão: " + (z + 1));
            do {
                vagoes[z] = scanner.nextInt();
                if (vagoes[z] < 0 && vagoes[z] >= 250) {
                    System.out.println("Valor inválido, tente novamente.");
                }
            } while (vagoes[z] < 0 && vagoes[z] >= 250);
        }
        for (int x = 0; x < vagoes.length; x++) {
            l = l + vagoes[x];
        }
        for (int y = 0; y < vagoes.length; y++) {
            if (vagoes[y] <= 50) {
                System.out.println("O primeiro vagão contém " + vagoes[y] + " pessoas, sendo considerado azul, e um total de " + l + " passageiros");
            } else if (vagoes[y] <= 100) {
                System.out.println("O segundo vagão  contém " + vagoes[y] + " pessoas, sendo considerado amarelo, e um total de " + l + " passageiros");
            } else if (vagoes[y] <= 150) {
                System.out.println("O terceiro vagão contém " + vagoes[y] + " pessoas, sendo considerado laranja, e um total de " + l + " passageiros");
            } else if (vagoes[y] <= 250) {
                System.out.println("O quarto vagão  contém " + vagoes[y] + "sendo considerado vermelho, e um total de " + l + " passageiros");
            }
        }
    }

}
