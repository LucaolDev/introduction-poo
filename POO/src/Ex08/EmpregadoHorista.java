package Ex08;

public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    @Override
    public String toString() {
        return super.toString() + " -- " + totalDeHorasTrabalhadas + " -- " + valorDaHoraTrabalhada;
    }

    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }

}