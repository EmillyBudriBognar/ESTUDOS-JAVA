/*
36. Faça um programa na Linguagem  Java  que apresente os valores de
conversão de graus Celsius em Fahrenheit, de 10 em 10 graus,
iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
O programa deve apresentar os valores das duas temperaturas.
*/

public class CelsiusParaFahrenheitDe10Em10 {

    public static void main(String[] args) {
        
        System.out.println("Conversão de Celsius para Fahrenheit:");
        System.out.println("------------------------------------");
        System.out.println("Celsius\tFahrenheit");
        
        for (int celsius = 10; celsius <= 100; celsius = celsius + 10) {
            
            double fahrenheit = (9.0 * celsius / 5.0) + 32.0;
            
            System.out.printf("%d\t%.1f%n", celsius, fahrenheit);
            
        }
        
    }
    
}
