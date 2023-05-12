package gersoncalculadora;

import java.util.Scanner;

public class GersonCalculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char op;
        do {

            System.out.println("=== Calculadora ===");
            System.out.println("[+] - Adição");
            System.out.println("[-] - Subtração");
            System.out.println("[*] - Multiplicação");
            System.out.println("[/] - Divisão");
            System.out.println("[s] - Sair");
            System.out.print("<< ");

            op = teclado.nextLine().charAt(0);
            float a, b, c;
            switch (op) {

                case '+':
                    System.out.println("Digite dois números");
                    a = teclado.nextFloat();
                    b = teclado.nextFloat();
                    c = a + b;
                    System.out.println("Resultado: " + c);
                    break;

                case '-':
                    System.out.println("Digite dois números");
                    a = teclado.nextFloat();
                    b = teclado.nextFloat();
                    c = a - b;
                    System.out.println("Resultado: " + c);
                    break;
                case '*':
                    System.out.println("Digite dois números");
                    a = teclado.nextFloat();
                    b = teclado.nextFloat();
                    c = a * b;
                    System.out.println("Resultado: " + c);
                    break;

                case '/':
                    System.out.println("Digite dois números");
                    a = teclado.nextFloat();
                    b = teclado.nextFloat();
                    if (b == 0) {
                        System.out.println("Divisão por zero!");
                    } else {
                        c = a / b;
                        System.out.println("Resultado: " + c);
                    }
                    break;
                case 's':
                    teclado.close();
                    System.out.println("Calculadora encerrada!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Operação inválida");
                    System.out.println("Pressione ENTER para continuar!");
                    break;
            }
            teclado.nextLine();//Limpa o buffer do teclado
        } while (op != 's');

    }
}
