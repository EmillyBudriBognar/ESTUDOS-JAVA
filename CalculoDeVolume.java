/*Faça um programa na Linguagem Java para calcular e apresentar o
valor do volumede uma lata de óleo, utilizando a fórmula:
VOLUME <-- 3.14159 * RAIO2 * ALTURA. */

import java.util.Scanner;

public class CalculoDeVolume {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio da lata de óleo: ");
        double raio = entrada.nextDouble();

        System.out.print("Digite a altura da lata de óleo: ");
        double altura = entrada.nextDouble();

        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        System.out.println("O volume da lata de óleo é: " + volume);

        entrada.close();
    }
}
