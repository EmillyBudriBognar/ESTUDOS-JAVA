/*Crie um programa que:
Leia 10 números inteiros digitados pelo usuário.
Mostre apenas os números pares.
Ao final, exiba também quantos pares foram encontrados.
Complexidade:
Percorrer vetor: O(n).
Verificar paridade de cada número: O(1) por elemento.
Total: O(n). */

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros pares digitados:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                pares++;
            }
        }

        System.out.println("\nQuantidade de pares: " + pares);

        sc.close();
    }
}
