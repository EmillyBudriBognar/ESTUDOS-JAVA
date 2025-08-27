//NOME: Emilly Budri Bognar
//RA: 2171392511009
//OBJETIVO: Criar uma coleção na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 no vetor–	Após a inserção, somente após a inserção mostrar o vetor.Obs. Não efetuar a leitura de 10 elementos

public class ArrayDeDez {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Elementos do array:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}