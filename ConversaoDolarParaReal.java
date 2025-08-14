/*Faça um programa na Linguagem Java que efetue a apresentação do valor da
conversão em real de um valor lido em dólar. O programa deve solicitar
o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário,
para que seja apresentado o valor em moeda brasileira. */

import java.util.Scanner;

public class ConversaoDolarParaReal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = entrada.nextDouble();

        System.out.print("Digite a quantidade de dólares: ");
        double quantidadeDolares = entrada.nextDouble();

        double valorEmReais = cotacaoDolar * quantidadeDolares;
        System.out.printf("O valor em reais é: %.2f%n", valorEmReais);

        entrada.close();
    }
}
