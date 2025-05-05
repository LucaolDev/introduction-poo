public class Cilindro extends Forma implements Volume{

    private Double altura;

    public Cilindro(int cordenadaX, int cordenadaY, Double raio, Double altura) {
        super(cordenadaX, cordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 1;
    }

    @Override
    public double calcularVolume() {
        return -1;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "altura = " + altura;
    }
}
