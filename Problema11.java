import java.util.Scanner;

public class Problema11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vendas = new int[3][4]; 
        String[] produtos = {"Camisas", "Calças", "Jaquetas", "Sapatos"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as vendas do Vendedor " + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Quantidade de " + produtos[j] + ": ");
                vendas[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz de vendas (Vendedores x Produtos):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(vendas[i][j] + " ");
            }
            System.out.println();
        }

        int totalLoja = 0;
        int[] totalVendedor = new int[3];
        int[] totalProduto = new int[4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                totalLoja += vendas[i][j];
                totalVendedor[i] += vendas[i][j];
                totalProduto[j] += vendas[i][j];
            }
        }

        System.out.println("Total de peças vendidas na loja: " + totalLoja);

        for (int i = 0; i < 3; i++) {
            System.out.println("Total vendido pelo Vendedor " + (i+1) + ": " + totalVendedor[i]);
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Total vendido do Produto " + produtos[j] + ": " + totalProduto[j]);
        }

        int melhorVendedor = 0;
        for (int i = 1; i < 3; i++) {
            if (totalVendedor[i] > totalVendedor[melhorVendedor]) {
                melhorVendedor = i;
            }
        }

        int produtoMaisVendido = 0;
        for (int j = 1; j < 4; j++) {
            if (totalProduto[j] > totalProduto[produtoMaisVendido]) {
                produtoMaisVendido = j;
            }
        }

        System.out.println("Vendedor que mais vendeu: Vendedor " + (melhorVendedor + 1));
        System.out.println("Produto mais vendido: " + produtos[produtoMaisVendido]);
    }
}
