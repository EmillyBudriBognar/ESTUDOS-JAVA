/*
22. Faça um programa na Linguagem  Java  que
leia 3 números inteiros e mostre o maior deles.
*/

import java.util.Scanner;

public class MaiorDeTres {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();
        
        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();
        
        System.out.println("Digite o terceiro número:");
        int numero3 = sc.nextInt();
        
        int maior = numero1;
        
        if (numero2 > maior) {
            maior = numero2;
        }
        
        if (numero3 > maior) {
            maior = numero3;
        }
        
        System.out.println("O maior número é: " + maior);
        
        sc.close();
        
    }
    
}
