public abstract class Forma {
    private int cordenadaX;
    private int cordenadaY;
    private double raio;

    public Forma(int cordenadaX, int cordenadaY, Double raio) {
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
        this.raio = raio;
    }

    public abstract double calcularArea();

    public int getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(int cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public int getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(int cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return  "cordenadaX = " + cordenadaX +
                ", cordenadaY = " + cordenadaY +
                ", raio = " + raio;
    }
}
