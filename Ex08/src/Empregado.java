public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String toString() {
        return matricula + " -- " + nome;
    }

    public abstract double calcularSalario();

}
