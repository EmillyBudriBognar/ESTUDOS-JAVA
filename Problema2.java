import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor digitado: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < 15; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
