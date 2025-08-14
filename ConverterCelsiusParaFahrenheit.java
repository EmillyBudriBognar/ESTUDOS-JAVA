/*Faça um programa na Linguagem Java que leia
uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
A fórmula de conversão é F <-- (9 * C + 160) /5,
sendo f a temperatura em Fahrenheit e C a temperatura em Celsius. */

import java.util.Scanner; 

public class ConverterCelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);

        entrada.close();
    }
}
