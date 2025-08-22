/*
31. Faça um programa na Linguagem Java que 
receba um número e mostre o fatorial desse número.
*/

import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro não negativo:");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Fatorial não pode ser calculado para números negativos.");
        } else {
           
            if (n == 0) {
                System.out.println("O fatorial de 0 é 1.");
            } else {
                long fatorial = 1;
                
                for (int i = 1; i <= n; i++) {
                    fatorial = fatorial * i;
                }
                System.out.println("O fatorial de " + n + " é " + fatorial);
            }
        }
        
        sc.close();
    }
}
