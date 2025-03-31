package Ex07.br.fiap.main;

import Ex07.br.fiap.fornecedor.Fornecedor;

public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("sla", 123);
        System.out.println(fornecedor.getNome());
        fornecedor.setNome("rob");
        System.out.println(fornecedor.getNome());

    }
}
