package Ex08;

public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(1, "X", 100, 10);
        empregado[1] = new EmpregadoHorista(2, "A", 100, 10);
        empregado[2] = new EmpregadoHorista(3, "B", 100, 10);

        for(Empregado e : empregado) {
            System.out.println(e);
            System.out.println(e.calcularSalario());
            System.out.println();
        }

    }
}
