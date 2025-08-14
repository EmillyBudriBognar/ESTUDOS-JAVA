/*Faça um programa na Linguagem Java que calcule a
área da circunferência. */

import java.util.Scanner;;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência: ");
        double raio = entrada.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);
        System.out.println("A área da circunferência é: " + area);

        entrada.close();
    }
}
