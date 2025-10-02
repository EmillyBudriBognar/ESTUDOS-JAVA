import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];

        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor original: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor invertido: ");
        for (int i = 7; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
