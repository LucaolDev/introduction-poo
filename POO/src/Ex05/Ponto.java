package Ex05;

public class Ponto {
    int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto p) {
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distancia;
    }

    public double calcularDistanciaAteOrigem() {
        Ponto origem = new Ponto(0, 0);
        return calcularDistancia(origem);
    }

    public static Ponto maisProximoDaOrigem(Ponto p1, Ponto p2) {
        double distp1 = p1.calcularDistanciaAteOrigem();
        double distp2 = p1.calcularDistanciaAteOrigem();
        if (distp1 < distp2) {
            return p1;
        } else
            return p2;
    }

}
