import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        System.out.println("Digite as notas dos 5 alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota do aluno " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        System.out.print("Notas digitadas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        double media = soma / 5;
        System.out.println("A média da turma é: " + media);
    }
}
