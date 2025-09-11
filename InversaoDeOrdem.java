/*Crie um programa que:
Leia 10 números inteiros digitados pelo usuário.
Imprima os elementos na ordem inversa em que foram digitados.
Complexidade:
Leitura: O(n).
Percorrer de trás para frente: O(n).
Total: O(n). */

import java.util.Scanner;

public class InversaoDeOrdem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}
