import java.util.Scanner;

public class ProblemaExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor antes de ordenar: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.print("Vetor após ordenar: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
