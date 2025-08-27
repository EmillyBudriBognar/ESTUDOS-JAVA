public class ManipulacaoArrays {

    public static void main(String[] args) throws Exception {
        // Declaração e inicialização de array - forma 1
        // Array de 5 posições
        int[] numeros = new int[5];

        // Inicializando valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Declaração e inicialização - forma 2 (mais comum)
        int[] outrosNumeros = {1, 2, 3, 4, 5};

        // Acessando elementos
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Tamanho do array: " + numeros.length);

        // Exibindo todos os elementos do primeiro array
        System.out.println("\nElementos do array 'numeros':");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }
        
        // Exibindo todos os elementos do segundo array
        System.out.println("\nElementos do array 'outrosNumeros':");
        for (int i = 0; i < outrosNumeros.length; i++) {
            System.out.println("Elemento " + i + ": " + outrosNumeros[i]);
        }
    }
}