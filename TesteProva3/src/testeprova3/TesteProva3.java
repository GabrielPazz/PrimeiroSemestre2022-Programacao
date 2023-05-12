package testeprova3;

import java.util.Scanner;

public class TesteProva3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float numerais;
        int NumeroPar = 0;
        int NumeroImpar = 0;

        for (int x = 0; x < 20; x++) {
            System.out.println("Digite o número inteiro:");
            numerais = teclado.nextInt();

            if (numerais > 0 && numerais <= 100) {
                float resto = numerais % 2;
                if (resto == 0) {
                    NumeroPar++;
                } else {
                    NumeroImpar++;
                }

            }
        }

        System.out.println("A quantidade de numeros pares digitados é igual a: " + NumeroPar);
        System.out.println("A quantidade de numeros impares digitadas é igual a: " + NumeroImpar);

    }

}
