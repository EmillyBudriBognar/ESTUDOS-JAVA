import java.util.Scanner;

public class EntradaSaidaDeDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /* ENTRADA
        Aqui simulamos a obtenção de dados vindos de uma fonte externa (usuário)
        Em estruturas de dados, isso pode vir de teclado, arquivos, rede, sensores etc.
        */
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        // Lemos como texto e convertemos para inteiro
        int idade = Integer.parseInt(entrada.nextLine());

        /* PROCESSAMENTO
        Em um problema real, aqui aplicaríamos operações e algoritmos sobre os dados.
        Por exemplo, adicionar esse nome e idade em uma lista, pilha, fila ou banco de dados.
        */
        String mensagem = String.format("Olá %s, você tem %d anos.", nome, idade);

        /* SAÍDA
        Apresentamos o resultado final para o usuário ou para outra aplicação.
        */
        System.out.println(mensagem);

        entrada.close();
    }
}
