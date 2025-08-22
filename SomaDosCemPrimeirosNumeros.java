/*
33. Faça um programa na Linguagem  Java  para apresentar o total
da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).
*/

public class SomaDosCemPrimeirosNumeros {
    
    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        
        System.out.println("A soma dos 100 primeiros números inteiros é: " + soma);
        
    }
    
}
