package Ex06;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario +=  salario * porcentagem / 100;
    }

    public void aumentarSalario(String cargo, double porcentagem) {
        if (this.cargo.equalsIgnoreCase(cargo)) {
            salario += salario * porcentagem / 100;
        }
    }

    public void pormover(String novoCargo) {
        cargo = novoCargo;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCargo: " + cargo + "\nSalario: " + salario + "\n";
    }
}
