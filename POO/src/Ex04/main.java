package Ex04;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Aluno aluno =  new Aluno();
        System.out.print("Digte o nome do aluno: ");
        aluno.nome = in.next();
        System.out.println("Digte o rm do aluno: ");
        aluno.rm = in.nextInt();

        for (int i = 0; i < aluno.disciplina.length; i++) {
            System.out.println("Diciplina: " + (i+1));
            System.out.print("Nome: ");
            aluno.disciplina[i] = in.next();
            for (int j = 0; j < aluno.notas[i].length; j++) {
                System.out.print("Nota " + (i+1) + ": ");
                aluno.notas[i][j] = in.nextDouble();
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Nome: " + aluno.nome);
        System.out.println("RM: " + aluno.rm);
        for (int i = 0; i <aluno.disciplina.length ; i++) {
            System.out.println();
            System.out.println("Disciplina: " + aluno.disciplina[i]);
            System.out.println("Média = " + aluno.calcularMedia(i));
            System.out.println("Status = " + aluno.verificaStatus(i));
            System.out.println();
        }

        in.close();
    }
}

