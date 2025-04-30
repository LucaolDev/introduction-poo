public class EntregaExpressa extends Entrega {

    public EntregaExpressa(String destino, double distancia) {
        super(destino, distancia);
    }

    @Override
    public double calcularTempoEntrega() {
        return super.calcularTempoEntrega() / 2;
    }
}