package Ex08;

public class EmpregadoComissionado extends Empregado{

    double totalDeVendas;
    double comissao;

    public double calcularSalario(){
//        return totalDeVendas * comissao / 100;
        return 1;
    }

    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "totalDeVendas = " + totalDeVendas +
                ", comissao = " + comissao +
                ", matricula = " + matricula +
                ", nome = '" + nome + '\'' +
                '}';
    }
}
