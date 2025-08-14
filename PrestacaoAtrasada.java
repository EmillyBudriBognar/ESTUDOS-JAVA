/*Faça um programa na Linguagem Java para efetuar o
cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO). */

import java.util.Scanner;

public class PrestacaoAtrasada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valor = entrada.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        double taxa = entrada.nextDouble();

        System.out.print("Digite o tempo em atraso (em meses): ");
        int tempo = entrada.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);
        System.out.println("O valor da prestação em atraso é: " + prestacao);

        entrada.close();
    }
}

