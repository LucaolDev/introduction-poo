public class Circulo extends Forma{

    public Circulo(int cordenadaX, int cordenadaY, Double raio) {
        super(cordenadaX, cordenadaY, raio);
    }

    public double calcularArea(){
        return Math.PI * Math.pow(getRaio(), 2);
    }


}
