/*
24. Faça um programa na Linguagem  Java  que efetue a leitura de um
número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.
*/

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        
        sc.close();
        
    }
    
}
