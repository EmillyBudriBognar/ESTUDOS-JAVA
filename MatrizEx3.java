import java.util.Scanner;

public class MatrizEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] M = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                M[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nElementos pedidos:");
        System.out.println("M[0][1] = " + M[0][1]);
        System.out.println("M[1][2] = " + M[1][2]);
        System.out.println("M[3][0] = " + M[3][0]);

        sc.close();
    }
}
