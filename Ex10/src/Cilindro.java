public class Cilindro extends Forma{

    private Double altura;

    public Cilindro(int cordenadaX, int cordenadaY, Double raio, Double altura) {
        super(cordenadaX, cordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public Double calcularVolume(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }
}
