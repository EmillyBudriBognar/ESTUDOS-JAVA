import java.util.Scanner;

public class GerenciadorDeTarefas {

    // Função para remover acentos manualmente
    public static String removerAcentos(String texto) {
        texto = texto.replace("á", "a").replace("à", "a").replace("ã", "a").replace("â", "a")
                     .replace("é", "e").replace("ê", "e")
                     .replace("í", "i")
                     .replace("ó", "o").replace("ô", "o").replace("õ", "o")
                     .replace("ú", "u")
                     .replace("ç", "c");

        texto = texto.replace("Á", "a").replace("À", "a").replace("Ã", "a").replace("Â", "a")
                     .replace("É", "e").replace("Ê", "e")
                     .replace("Í", "i")
                     .replace("Ó", "o").replace("Ô", "o").replace("Õ", "o")
                     .replace("Ú", "u")
                     .replace("Ç", "c");

        return texto.toLowerCase().trim();
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String tarefa;
        String resposta;

        System.out.println("oii qual é a sua tarefa de hoje?");
        tarefa = teclado.nextLine(); 

        System.out.println("ok vamos la!");

        do {
            System.out.println("sua tarefa é: " + tarefa);
            System.out.print("já terminou? (sim/não): ");
            resposta = removerAcentos(teclado.nextLine()); // normaliza resposta

        } while (resposta.equals("nao") || resposta.equals("n"));

        if (resposta.equals("sim") || resposta.equals("s")) {
            System.out.println("arrasou, tarefa feita!");
        } else {
            System.out.println("não entendi sua resposta, mas vamos considerar que terminou. Arrasou!");
        }

        teclado.close();
    }
}
