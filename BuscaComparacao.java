import java.util.Arrays;
import java.util.Random;

public class BuscaComparacao {
    public static void main(String[] args) {
        int tamanho = 10000;
        int[] vetor = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100000);
        }

        int valorProcurado = vetor[random.nextInt(tamanho)];

        long inicioLinear = System.nanoTime();
        int resultadoLinear = buscaLinear(vetor, valorProcurado);
        long fimLinear = System.nanoTime();

        System.out.println("Busca Linear: índice encontrado = " + resultadoLinear);
        System.out.println("Tempo de execução: " + (fimLinear - inicioLinear) + " ns");

        Arrays.sort(vetor);
        long inicioBinaria = System.nanoTime();
        int resultadoBinaria = buscaBinaria(vetor, valorProcurado);
        long fimBinaria = System.nanoTime();

        System.out.println("\nBusca Binária: índice encontrado = " + resultadoBinaria);
        System.out.println("Tempo de execução: " + (fimBinaria - inicioBinaria) + " ns");
    }

    public static int buscaLinear(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
