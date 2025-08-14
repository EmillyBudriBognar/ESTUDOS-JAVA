/*Faça um programa na Linguagem Java que receba um
número e mostre o resto da divisão por 6. */

import java.util.Scanner;

public class RestoDivisaoPorSeis {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ser dividido por 6: ");
        int numero = entrada.nextInt();

        int resto = numero % 6;
        System.out.println("O resto da divisão de " + numero + " por 6 é: " + resto);

        entrada.close(); 
    }
}
