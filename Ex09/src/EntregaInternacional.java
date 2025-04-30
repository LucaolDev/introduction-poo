public class EntregaInternacional extends Entrega {

    public EntregaInternacional(String destino, double distancia) {
        super(destino, distancia);
    }

    @Override
    public double calcularTempoEntrega() {
        return super.calcularTempoEntrega() + 5;
    }
}