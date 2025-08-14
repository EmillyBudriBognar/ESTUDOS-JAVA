/*
Programa de Cálculos Básicos:

- Crie um programa que solicite ao usuário a entrada de dois números inteiros.
- Mostre na tela o resultado da soma, subtração, multiplicação, divisão e módulo desses dois números.
- Use os operadores aritméticos apropriados para cada cálculo.

Manipulação de Array:

- Crie um array de números inteiros com 5 posições e preencha-o com valores à sua escolha.
- Percorrer e Somar (Acumulador): Percorra todos os elementos do array e some-os utilizando um operador de atribuição composta (+=). Exiba a soma total.
- Percorrer Circularmente: Simule o percorrimento circular de um índice no array usando o operador de módulo (%). Mostre o elemento que seria acessado após algumas "voltas" no array (ex: se o array tem 5 posições, o índice 6 seria o mesmo que o índice 1).
*/

import java.util.Arrays;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //Parte1
        System.out.println("=== PARTE 1: CÁLCULOS BÁSICOS ===");

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;

        //Caso for 0
        if(num2 != 0){
            int divisao = num1 / num2;
            int modulo = num1 % num2;
            System.out.println("Divisao: " + divisao);
            System.out.println("Modulo: " + modulo);
        } else {
            System.out.println("Divisao e modulo nao podem ser feitos (divisao por zero)");
        }

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);

        // Parte2
        System.out.println("\n=== PARTE 2: ARRAY DINÂMICO ===");

        int[] numeros = {5, 12, 7, 20, 3};
        System.out.println("Array completo: " + Arrays.toString(numeros));

        //Soma
        int somaArray = 0; 
        for (int i = 0; i < numeros.length; i++) { 
            somaArray += numeros[i]; 
        }
        System.out.println("Soma total do array: " + somaArray);

        //Circular
        int indice = 6; 
        int indiceCircular = indice % numeros.length; 

        System.out.println("Índice escolhido (circular): " + indice);
        System.out.println("Elemento acessado: " + numeros[indiceCircular]);

        entrada.close();
    }
}
