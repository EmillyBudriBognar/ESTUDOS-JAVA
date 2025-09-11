/*Crie um programa que:
Peça ao usuário para digitar 10 números inteiros.
Armazene esses números em um vetor.
Imprima todos os números na mesma ordem em que foram digitados.
Complexidade:
Leitura: O(n) (precisa ler todos os elementos).
Impressão: O(n).
Total: O(n).

 */

import java.util.Scanner;

public class LeituraEImpressao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
