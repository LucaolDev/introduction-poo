package Ex08;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    private Controle controle = new Controle();

    public void menu() {

        String aux = "1. Cadastrar\n2. Pesquisar\n3. Listar\n4. Finalizar";
        int opcao;


        while (true) {
            opcao = parseInt(showInputDialog(aux));
            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    Pesquisar();
                    break;
                case 3:
                    Listar();
                    break;
                case 4:
                    return;
                default:
                    showMessageDialog(null, "Opção inválida");
                    break;

            }
        }
    }

    private void Listar() {
        showMessageDialog(null, controle.listar());
    }

    private void Pesquisar() {
        long matricula = parseLong(showInputDialog("Matricula"));
        Empregado empregado = controle.pesquisar(matricula);
        if(empregado == null){
            showMessageDialog(null, "Empregado não encontrado");
        }
        else{
            showMessageDialog(null, empregado);
        }
    }

    private void cadastrar() {
        long matricula;
        String nome;
        int totalDeHorasTrabalhadas;
        double valorDaHoraTrabalhada;
        double totalDeVendas, comissao;
        String aux = "1. Empregado horista\n2. Empregado comissionado\n3. Sair";
        int opcao;
        Empregado empregado;

        while (true) {
            opcao = parseInt(showInputDialog(aux));
            if (opcao == 3) {
                return;
            }
            if (opcao == 1 || opcao == 2) {
                matricula = parseInt(showInputDialog("Matricula"));
                nome = showInputDialog("Nome");
                if (opcao == 1) {
                    totalDeHorasTrabalhadas = parseInt(showInputDialog("Total de horas trabalhadas"));
                    valorDaHoraTrabalhada = parseDouble(showInputDialog("Valor da hora"));
                    empregado = new EmpregadoHorista(matricula, nome, totalDeHorasTrabalhadas, valorDaHoraTrabalhada);
                    controle.inserir(empregado);
                } else if(opcao == 2){
                    totalDeVendas = parseDouble(showInputDialog("total de vendas"));
                    comissao = parseDouble(showInputDialog("Porcentagem da comissao"));
                    empregado = new EmpregadoComissionado(matricula, nome, totalDeVendas, comissao);
                    controle.inserir(empregado);
                }

            }else
                showMessageDialog(null, "Opção inválida");

        }
    }
}
