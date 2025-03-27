package Ex07;

public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("sla", 123);
        System.out.println(fornecedor.getNome());
        fornecedor.setNome("rob");
        System.out.println(fornecedor.getNome());
    }
}
