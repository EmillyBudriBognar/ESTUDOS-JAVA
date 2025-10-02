import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[12];
        int pares = 0, impares = 0;

        System.out.println("Digite 12 números inteiros:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.print("Vetor digitado: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
