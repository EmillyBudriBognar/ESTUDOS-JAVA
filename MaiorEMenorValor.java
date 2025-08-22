/*
23. Faça um programa na Linguagem Java  que efetue a leitura
de cinco números inteiros e identificar o maior e o menor valor.
Não execute a ordenação de valores.
*/

import java.util.Scanner;

public class MaiorEMenorValor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite cinco números inteiros:");
        
        int numero;
        int maior, menor;
        
        numero = sc.nextInt();
        maior = numero;
        menor = numero;
        
        for (int i = 0; i < 4; i++) {
            numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        
        sc.close();
        
    }
    
}
