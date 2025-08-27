//NOME: Emilly Budri Bognar
//RA: 2171392511009
//OBJETIVO: Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.

public class ArrayMediaDeNotas {

    public static void main(String[] args) {

        double[] notasProva1 = {7.5, 8.0, 6.5, 9.0, 7.0};
        double[] notasProva2 = {8.0, 7.5, 7.0, 9.5, 8.5};

        System.out.println("Médias dos alunos:");
        for (int i = 0; i < 5; i++) {
            double media = (notasProva1[i] + notasProva2[i]) / 2.0;
            System.out.println("Aluno " + (i + 1) + ": " + media);
        }
    }
}