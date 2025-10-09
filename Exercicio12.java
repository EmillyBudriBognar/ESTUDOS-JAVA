// não lembro exatamente como eu fiz na prova, mas acho que era algo parecido
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] > maior) {
                maior = numeros[j];
            }
            if (numeros[j] < menor) {
                menor = numeros[j];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}
