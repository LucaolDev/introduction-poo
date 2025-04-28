public class Controle {

    private Empregado[] empregado = new Empregado[5];
    private int index = 0;

    public void inserir(Empregado empregado) {
        this.empregado[index++] = empregado;
    }

    public Empregado pesquisar(long matricula) {
        for(int i = 0; i < index; i++) {
            if(empregado[i].matricula == matricula) {
                return empregado[i];
            }
        }
        return null;
    }

    public String listar() {
        String aux = "";
        for(int i = 0; i < index; i++) {
            aux += empregado[i] + "\n";
            aux += "Salário R$ " + empregado[i].calcularSalario() + "\n";
        }
        return aux;
    }
}