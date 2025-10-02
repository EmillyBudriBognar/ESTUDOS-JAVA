import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros (um por vez):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        System.out.print("Vetor digitado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        System.out.println("A soma de todos os números é: " + soma);
    }
}
