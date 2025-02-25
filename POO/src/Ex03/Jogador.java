package Ex03;

public class Jogador {

    String nome;
    Integer pontos[] = new Integer[3];

    public int pontosTotal(){
        int total = 0;
        for (int i = 0; i < pontos.length; i++) {
          total += pontos[i];
        }
        return total;
    }

}
