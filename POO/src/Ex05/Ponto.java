package Ex05;

public class Ponto {
    // atributos ou variáveis de instância
    int x;
    int y;

    // método para calcular e retornar a distância entre dois pontos
    public double calcularDistancia(Ponto p) {
        double distancia;
        distancia = Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
        return distancia;
    }

    // método para calcular e retornar a distância do pontoa até a origem
    public double calcularDistanciaAteOrigem() {
        double distancia;
        Ponto origem = new Ponto();
        origem.x = 0;
        origem.y = 0;
        distancia = calcularDistancia(origem);
        return distancia;
    }

    // método para retornar o ponto mais perto da origem
    public static Ponto maisPertoDaOrigem(Ponto p1, Ponto p2) {
        double dp1 = p1.calcularDistanciaAteOrigem();
        double dp2 = p2.calcularDistanciaAteOrigem();
        if(dp1 < dp2) {
            return p1;
        }
        return p2;
    }
}