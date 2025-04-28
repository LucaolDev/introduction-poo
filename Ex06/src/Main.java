import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Luis", "Gerente", 15000);
        Funcionario f2 = new Funcionario("Guilhermo", "Senior", 8000);


        System.out.print(f1);
        f1.aumentarSalario(10);
        System.out.print(f1);

    }
}
