/*Crie um programa que:
Leia 5 números reais digitados pelo usuário.
Calcule e imprima:
a soma dos números;
a média dos números.
Complexidade:
Leitura: O(n).
Cálculo da soma: O(n).
Divisão para média: O(1).
Total: O(n). */

import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        double media = soma / 5;

        System.out.println("\nSoma = " + soma);
        System.out.println("Média = " + media);

        sc.close();
    }
}
