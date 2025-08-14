/*Faça um programa na Linguagem Java que leia a idade de uma pessoa
expressa em ano, mês e dia e mostre-as em dias. */

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        String dataNasc = entrada.nextLine();

        String[] partes = dataNasc.split("/");

        int diaNasc = Integer.parseInt(partes[0]);
        int mesNasc = Integer.parseInt(partes[1]);
        int anoNasc = Integer.parseInt(partes[2]);

        System.out.print("Digite a data atual (dd/mm/aaaa): ");
        String dataAtual = entrada.nextLine();

        String[] partesAtual = dataAtual.split("/");

        int diaAtual = Integer.parseInt(partesAtual[0]);
        int mesAtual = Integer.parseInt(partesAtual[1]);
        int anoAtual = Integer.parseInt(partesAtual[2]);

        int totalDiasAtual = (anoAtual * 365) + (mesAtual * 30) + diaAtual;
        int totalDiasNasc = (anoNasc * 365) + (mesNasc * 30) + diaNasc;

        int diasDeVida = totalDiasAtual - totalDiasNasc;

        System.out.println("Você viveu aproximadamente " + diasDeVida + " dias.");

        entrada.close();
    }
}
