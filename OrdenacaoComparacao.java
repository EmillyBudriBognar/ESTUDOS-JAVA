import java.util.Random;

public class OrdenacaoComparacao {
    public static void main(String[] args) {
        int[] numeros = new int[10000];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100000);
        }

        int[] vetorBubble = numeros.clone();
        int[] vetorInsertion = numeros.clone();
        int[] vetorQuick = numeros.clone();

        long inicioBubble = System.nanoTime();
        bubbleSort(vetorBubble);
        long fimBubble = System.nanoTime();
        System.out.println("Bubble Sort: " + (fimBubble - inicioBubble) + " ns");

        long inicioInsertion = System.nanoTime();
        insertionSort(vetorInsertion);
        long fimInsertion = System.nanoTime();
        System.out.println("Insertion Sort: " + (fimInsertion - inicioInsertion) + " ns");

        long inicioQuick = System.nanoTime();
        quickSort(vetorQuick, 0, vetorQuick.length - 1);
        long fimQuick = System.nanoTime();
        System.out.println("Quick Sort: " + (fimQuick - inicioQuick) + " ns");
    }

    public static void bubbleSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = dividir(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int dividir(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] < pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        return i + 1;
    }
}
