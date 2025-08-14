/*Faça um programa na Linguagem Java  para ler
dois valores inteiros para as variáveis A e B e
efetuar a troca dos valores de forma que a variável A
passe a possuir o valor da variável B e a variável B passe
a possuir o valor da variável A. Apresentar os valores trocados. */

import java.util.Scanner;

public class TrocaDeValoresDeVariavel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = entrada.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = entrada.nextInt();

        // Troca os valores
        int varTemporaria = A;
        A = B;
        B = varTemporaria;

        System.out.println("Valores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        entrada.close();
    }
}
