// não lembro direito se eu fiz desse jeito, mas deve ter sido algo assim.
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        System.out.println("Digite os números da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número a" + (i+1) + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        sc.close();
    }
}
