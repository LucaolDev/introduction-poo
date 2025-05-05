public class Circulo extends Forma{

    public Circulo(int cordenadaX, int cordenadaY, Double raio) {
        super(cordenadaX, cordenadaY, raio);
    }

    @Override
    public double calcularArea() {
        return 1;
    }
}
