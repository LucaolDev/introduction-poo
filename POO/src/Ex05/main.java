package Ex05;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Ponto p1 = new Ponto(2,2);
        Ponto p2 = new Ponto(7,7);


        System.out.println("Disctancia do p1 para o p2: " + p1.calcularDistancia(p2));
        System.out.println("Disctancia do p2 para o p1: " + p2.calcularDistancia(p1));
        System.out.println();
        System.out.println("Disctancia do p1 para origem: " + p1.calcularDistanciaAteOrigem());
        System.out.println("Disctancia do p2 para origem: " + p2.calcularDistanciaAteOrigem());


        Ponto maisProximo = Ponto.maisProximoDaOrigem(p1, p2);
        System.out.println("Ponto mais proximo da origem " + maisProximo.x + " " + maisProximo.y);
    }
}
