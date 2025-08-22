/*16. Faça um programa na Linguagem Java que leia 3 (três) valores inteiros
e apresente os 3 números em ordem crescente.*/

import java.util.Scanner;

public class OrdemCrescente {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        sc.close();
        
    }
    
}
