package util;


import fornecedor.Fornecedor;
import produto.Produto;

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
        String aux = "1. Cadastrar produto\n2. Pesquisar produto\n3. Pesquisar fornecedor\n4. Finalizar";

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
                    pesquisar();
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
            fornecedor = cadastrarFornecedor();
        }
        nome = showInputDialog("Nome do produto");
        valorUnitario = parseDouble(showInputDialog("Valor unitário"));
        qtdEstoque = parseInt(showInputDialog("Quantidade em estoque"));
        produto[idxProduto] = new Produto(nome,valorUnitario, qtdEstoque, fornecedor);
        idxProduto++;
    }

    private Fornecedor cadastrarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor"));
        String nome = showInputDialog("Fornecedor");
        fornecedor[idxFornecedor] = new Fornecedor(nome, cnpj);
        idxFornecedor++;
        return fornecedor[idxFornecedor-1];
    }

    private void pesquisar() {
        Fornecedor fornecedor = pesquisarFornecedor();
        if (fornecedor != null){
            showMessageDialog(null, fornecedor.getCnpj() + "\n" +
                    fornecedor.getNome());
        }
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
        String aux = "Produto não encontrado";
        String nome = showInputDialog("Nome do Produto");
        for(int i = 0; i  < idxProduto; i++){
            if(produto[i].getNome().equalsIgnoreCase(nome)){
                aux = "";
                aux += "Nome do Produto: " + nome + "\n";
                aux += "Valor unitário: " + produto[i].getValor() + "\n";
                aux += "Fornecedor: " + produto[i].getFornecedor().getNome() + "\n";
                break;
            }
        }
        showMessageDialog(null, aux);
    }

}


