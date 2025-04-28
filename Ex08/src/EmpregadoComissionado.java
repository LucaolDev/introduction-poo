public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() + " -- " + totalDeVendas + " -- " + comissao;
    }

    public double calcularSalario() {
        return totalDeVendas * comissao / 100;
    }
}