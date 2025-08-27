//NOME: Emilly Budri Bognar
//RA: 2171392511009
//OBJETIVO: Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o usuário e inserir no vetor A–	Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	Após de todos os elementos do vetor A, mostrar os dois vetores

import java.util.Scanner;

public class ArrayFatorial {
    public static int calcularFatorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];

        int[] vetorB = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para o elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = calcularFatorial(vetorA[i]);
        }

        System.out.println("\n--- Vetores ---");
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B (fatorial): ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}