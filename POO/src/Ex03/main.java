package Ex03;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.println("Digite o nome do jogador: ");
        jogador.nome = in.next();
        System.out.println("Digite a pontuação: ");
        for (int i = 0; i < jogador.pontos.length; i++) {
            System.out.println("Rodada " + (i+1) + ": ");
            jogador.pontos[i] = in.nextInt();
        }

        System.out.println("\nJogador: " + jogador.nome);
        System.out.println("Pontos total: " + jogador.pontosTotal());;
    }
}
