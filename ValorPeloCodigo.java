/*
27. O cardápio de uma lanchonete é o seguinte:

Especificação          Código               Preço
Cachorro quente         100                  1,20
Bauru simples           101                  1,30
Bauru com ovo           102                  1,50
Hambúrger               103                  1,20
Cheeseburguer           104                  1,30
Refrigerante            105                  1,00

Faça um programa na Linguagem Java que leia o código do item pedido,
a quantidade e calcule o valor a ser pago por aquele lanche.
Considere que a cada execução somente será calculado um item.

*/
import java.util.Scanner;

public class ValorPeloCodigo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cardápio:");
        System.out.println("100 - Cachorro Quente: R$ 1.20");
        System.out.println("101 - Bauru Simples: R$ 1.30");
        System.out.println("102 - Bauru com Ovo: R$ 1.50");
        System.out.println("103 - Hambúrguer: R$ 1.20");
        System.out.println("104 - Cheeseburguer: R$ 1.30");
        System.out.println("105 - Refrigerante: R$ 1.00");
        System.out.println("---------------------------------");
        
        System.out.print("Digite o código do item: ");
        int codigo = sc.nextInt();
        
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        
        double preco = 0.0;
        
        if (codigo == 100) {
            preco = 1.20;
        } else if (codigo == 101) {
            preco = 1.30;
        } else if (codigo == 102) {
            preco = 1.50;
        } else if (codigo == 103) {
            preco = 1.20;
        } else if (codigo == 104) {
            preco = 1.30;
        } else if (codigo == 105) {
            preco = 1.00;
        } else {
            System.out.println("Código inválido!");
            sc.close();
            return;
        }
        
        double valorTotal = preco * quantidade;
        
        System.out.printf("Valor a ser pago: R$ %.2f%n", valorTotal);
        
        sc.close();
        
    }
    
}
