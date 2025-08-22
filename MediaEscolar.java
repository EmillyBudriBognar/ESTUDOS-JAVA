/*9. Faça um programa na Linguagem Java que leia quatros valores
referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7.
Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.
Apresentar junto das mensagens o valor da média do aluno para qualquer condição.
*/

import java.util.Scanner;

public class MediaEscolar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite as quatro notas do aluno:");
        
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("Média do aluno: %.2f%n", media);
        
        if (media >= 7.0) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno REPROVADO!");
        }
        
        sc.close();
        
    }
    
}
