/*Faça um programa na Linguagem Java que receba 2 números
e apresente a multiplicação dos dois números.*/

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int resultado = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + resultado);

        entrada.close(); 
    }
}
