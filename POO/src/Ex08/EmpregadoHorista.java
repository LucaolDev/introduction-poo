package Ex08;

public class EmpregadoHorista extends Empregado{

    int totalHorasTrablhadas;
    double valorHoraTrabalhada;

    public double calcularSalario(){
//        return totalHorasTrablhadas * valorHoraTrabalhada;
        return 2;
    }

    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "totalHorasTrablhadas = " + totalHorasTrablhadas +
                ", valorHoraTrabalhada = " + valorHoraTrabalhada +
                ", matricula = " + matricula +
                ", nome = '" + nome + '\'' +
                '}';
    }
}
