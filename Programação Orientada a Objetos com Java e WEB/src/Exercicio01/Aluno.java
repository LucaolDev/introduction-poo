package Exercicio01;
public class Aluno {

    private Integer rm;
    private String nome;
    private Double nota1;
    private Double nota2;

    public Aluno(Integer rm, String nome, Double nota1, Double nota2) {
        this.rm = rm;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Integer getRm() {
        return rm;
    }

    public void setRm(Integer rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String status() {
        if (calcularMedia() <= 7.0 - 0.1) {
            return "REPROVADO";
        }
        return "APROVADO";
    }

    @Override
    public String toString() {
        return "Rm: " + getRm() + "\nNome: " + getNome() + "\nNota 1: " + getNota1() + "\nNota 2: " + getNota2()
                + "\nMédia do Aluno: " + calcularMedia() + "\nStatus: " + status();
    }
}
