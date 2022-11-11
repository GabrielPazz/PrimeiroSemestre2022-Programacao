package testeprova2;

import java.util.Scanner;

public class TesteProva2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[]{72, 13, 33, 85, 97, 63, 60, 45};
        boolean resultado = false;
        float y;
        System.out.println("Digite um número para verificarmos seu cadastro:");
        int prova = teclado.nextInt();
        for (int t = 0; t < numero.length; t++) {
            if (numero[t] == prova) {
                resultado = true;

            }
        }
        if (resultado == true) {
            System.out.println("Número devidamente cadastrado!!");
        } else {
            System.out.println("Número não cadastrado, tente novamente :(");
        }
    }

}
