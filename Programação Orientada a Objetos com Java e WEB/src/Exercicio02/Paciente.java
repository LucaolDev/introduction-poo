package Exercicio02;

public class Paciente {
    
    private String nome;
    private Integer idade;
    
    public Paciente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public int frequenciaMaxima(){
        return 220 - idade;
    }
    
    public double frequenciaAlvoMinima(){
        double minima = frequenciaMaxima();
        double alvo = minima * 0.5;
        return alvo;
    }

    public double frequenciaAlvoMaxima(){
        double maxima = frequenciaMaxima();
        double alvoMaxima = maxima * 0.85;
        return alvoMaxima;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nFrequencia Máxima: " + frequenciaMaxima() + "\nFrequencia Alvo: " + frequenciaAlvoMinima() + "a " + frequenciaAlvoMaxima(); 
    }

}
