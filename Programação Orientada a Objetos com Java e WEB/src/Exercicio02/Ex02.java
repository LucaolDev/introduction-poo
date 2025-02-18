package Exercicio02;

import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Paciente paciente1 = new Paciente(null, null);
        System.out.println("Insira o nome do paciente: ");
        paciente1.setNome(in.nextLine());
        System.out.println("Insira a idade do paciente: ");
        paciente1.setIdade(in.nextInt());
    
        System.out.println(paciente1);
        in.close();
    }
}
