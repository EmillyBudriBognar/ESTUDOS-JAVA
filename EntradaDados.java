import java.util.Scanner;  // Importando a classe Scanner

public class EntradaDados {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner

        System.out.print("Entre com seu nome: ");  
        String nome = meuScanner.nextLine();                

        System.out.println("Seu nome é: " + nome);

        meuScanner.close(); // Fecha o Scanner
    }
}
