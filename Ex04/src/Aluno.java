public class Aluno {

    int rm;
    String nome;
    String[] disciplina = new String[3];
    double[][] notas = new double[disciplina.length][2];

    public double calcularMedia(int i){
        double media = 0;

        for (int j = 0; j < notas[i].length; j++) {
            media += notas[i][j];
        }

        return media / notas[i].length;
    }

    public String verificaStatus(int i){
        if (calcularMedia(i) >= 6){
            return "APROVADO";
        }
        return "REPROVADO";
    }

}
