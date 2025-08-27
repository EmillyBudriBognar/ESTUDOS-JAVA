//NOME: Emilly Budri Bognar
//RA: 2171392511009
//OBJETIVO: Criar uma coleção “A” na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 na coleção–	Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2–	Mostrar as duas coleções; Obs. Não efetuar a leitura de 10 elementos

public class ArrayMultiplicador {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i] * 2;
        }

        System.out.println("Coleção A:");
        for (int numero : arrayA) {
            System.out.println(numero);
        }

        System.out.println("\nColeção B:");
        for (int numero : arrayB) {
            System.out.println(numero);
        }
    }
}