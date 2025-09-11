/*Crie um programa que:
Leia 8 números inteiros digitados pelo usuário.
Mostre:
o maior valor e sua posição no vetor;
o menor valor e sua posição no vetor.
Complexidade:
Leitura: O(n).
Busca do maior e menor: O(n).
Total: O(n). */

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < 8; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("\nMaior valor: " + maior + " na posição " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição " + posMenor);

        sc.close();
    }
}
