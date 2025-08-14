/*Faça um programa na Linguagem Java que leia uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
A formula de conversão é C <-- (F - 32) * (5/9),
sendo f a temperatura em Fahrenheit e C a temperatura em Celsius. */

import java.util.Scanner;

public class ConverterFahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
        System.out.println("A temperatura em graus Celsius é: " + celsius);

        entrada.close();
    }
}
