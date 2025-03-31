package Ex07.br.fiap.util;

import Ex07.br.fiap.fornecedor.Fornecedor;
import Ex07.br.fiap.produto.Produto;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class Util {
    private Fornecedor[] fornecedor = new Fornecedor[5];
    private Produto[] produto = new Produto[2 * fornecedor.length];
    private int idxFornecedor = 0;
    private int idxProduto = 0;


    public void menu() {
    int opcao;
    String aux = "1. Cadastrar pesquisar\n2. Pesquisar procurar\n3. Pesquisar fornecedor\n4. Finalizar";

    while (true){
        opcao = parseInt(showInputDialog(aux));
        if(opcao == 4){
            return;
        }

        switch (opcao){
            case 1:
                cadastrarProduto();
                break;
            case 2:
                pesquisarProduto();
                break;
            case 3:
                pesquisarFornecedor();
                break;
            default:
                showMessageDialog(null, "Opção inválida");
        }
    }
    }

    private void cadastrarProduto() {
        String nome;
        int qtdEstoque;
        double valorUnitario;
        Fornecedor fornecedor = pesquisarFornecedor();

        if(fornecedor == null){
            cadastrarFornecedor();
        }
    }

    private void cadastrarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor"));
        String nome = showInputDialog("Fornecedor");
        fornecedor[idxFornecedor] = new Fornecedor(nome, cnpj);
        idxFornecedor++;
    }

    private Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor"));
        for(int i = 0; i  < idxFornecedor; i++){
            if(fornecedor[i].getCnpj() == cnpj){
                return fornecedor[i];
            }
        }
        showMessageDialog(null, cnpj + " não encontrado");
        return null;
    }


    private void pesquisarProduto() {
    }

}

