/*
Programa de Cálculos Básicos:

- Solicita ao usuário dois números inteiros.
- Mostra soma, subtração, multiplicação, divisão e módulo.

Manipulação de Array:

- Cria um array de 5 números inteiros preenchidos pelo usuário.
- Soma todos os elementos do array.
- Permite ao usuário escolher um índice e acessa o elemento circularmente usando %.
*/

import java.util.Arrays;
import java.util.Scanner;

public class CalculosEArray {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // ==========================
        // Parte 1: Cálculos Básicos
        // ==========================
        System.out.println("=== PARTE 1: CÁLCULOS BÁSICOS ===");

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;

        if (num2 != 0) {
            int divisao = num1 / num2;
            int modulo = num1 % num2;
            System.out.println("Divisão: " + divisao);
            System.out.println("Módulo: " + modulo);
        } else {
            System.out.println("Divisão e módulo não podem ser feitos (divisão por zero).");
        }

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        // ==========================
        // Parte 2: Manipulação de Array
        // ==========================
        System.out.println("\n=== PARTE 2: ARRAY DINÂMICO ===");

        int tamanhoArray = 5;
        int[] numeros = new int[tamanhoArray];

        // Preenchendo o array com valores do usuário
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Array completo: " + Arrays.toString(numeros));

        // Soma do array
        int somaArray = 0; 
        for (int i = 0; i < numeros.length; i++) { 
            somaArray += numeros[i]; 
        }
        System.out.println("Soma total do array: " + somaArray);

        // Escolha de índice pelo usuário
        System.out.print("Digite o índice que deseja acessar circularmente: ");
        int indice = entrada.nextInt();

        // Cálculo do índice circular
        int indiceCircular = indice % numeros.length;
        if (indiceCircular < 0) { // trata índice negativo
            indiceCircular += numeros.length;
        }

        System.out.println("Índice escolhido (circular): " + indice);
        System.out.println("Elemento acessado: " + numeros[indiceCircular]);

        entrada.close();
    }
}
