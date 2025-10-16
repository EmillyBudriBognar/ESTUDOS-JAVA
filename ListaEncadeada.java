import java.util.Scanner;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

public class ListaEncadeada {
    private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void incluir(int valor) {
        No novo = new No(valor);
        if (isEmpty()) {
            inicio = novo;
        } else {
            No aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    public void excluir(int valor) {
        if (isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio.valor == valor) {
            inicio = inicio.proximo;
            System.out.println("Valor removido: " + valor);
            return;
        }

        No aux = inicio;
        No anterior = null;

        while (aux != null && aux.valor != valor) {
            anterior = aux;
            aux = aux.proximo;
        }

        if (aux == null) {
            System.out.println("Valor não encontrado.");
        } else {
            anterior.proximo = aux.proximo;
            System.out.println("Valor removido: " + valor);
        }
    }

    public void listar() {
        if (isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        No aux = inicio;
        System.out.print("Lista: ");
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        while (true) {
            System.out.println("\nDigite:");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Excluir valor");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor: ");
                int v = sc.nextInt();
                lista.incluir(v);
            } else if (opcao == 2) {
                System.out.print("Digite o valor para remover: ");
                int v = sc.nextInt();
                lista.excluir(v);
            } else if (opcao == 3) {
                lista.listar();
            } else if (opcao == 4) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
