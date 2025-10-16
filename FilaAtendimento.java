import java.util.Scanner;

class NoCliente {
    String nome;
    NoCliente proximo;

    public NoCliente(String nome) {
        this.nome = nome;
        this.proximo = null;
    }
}

public class FilaAtendimento {
    private NoCliente inicio;

    public FilaAtendimento() {
        this.inicio = null;
    }

    public void incluirCliente(String nome) {
        NoCliente novo = new NoCliente(nome);
        if (inicio == null) {
            inicio = novo;
        } else {
            NoCliente aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
        System.out.println("Cliente adicionado: " + nome);
    }

    public void atenderCliente() {
        if (inicio == null) {
            System.out.println("Nenhum cliente na fila.");
        } else {
            System.out.println("Cliente " + inicio.nome + " foi atendido.");
            inicio = inicio.proximo;
        }
    }

    public void listarFila() {
        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        NoCliente aux = inicio;
        System.out.print("Fila: ");
        while (aux != null) {
            System.out.print(aux.nome);
            if (aux.proximo != null) {
                System.out.print(" -> ");
            }
            aux = aux.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaAtendimento fila = new FilaAtendimento();

        while (true) {
            System.out.println("\nDigite:");
            System.out.println("1 - Incluir cliente");
            System.out.println("2 - Atender cliente");
            System.out.println("3 - Listar fila");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do cliente: ");
                String nome = sc.nextLine();
                fila.incluirCliente(nome);
            } else if (opcao == 2) {
                fila.atenderCliente();
            } else if (opcao == 3) {
                fila.listarFila();
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
