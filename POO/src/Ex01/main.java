package Ex01;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Aluno aluno1 = new Aluno(null, null, null, null);

        System.out.println("Digite o RM do aluno: ");
        aluno1.setRm(in.nextInt());
        System.out.println("Digite o Nome do aluno");
        in.nextLine();
        aluno1.setNome(in.nextLine());
        System.out.println("Digite a primeira nota do aluno");
        aluno1.setNota1(in.nextDouble());
        System.out.println("Digite a segunda do aluno");
        aluno1.setNota2(in.nextDouble());
        System.out.println(aluno1);

        in.close();
    }
}
