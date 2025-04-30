
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Entrega> lista = new ArrayList<>();
        lista.add(new EntregaExpressa("RJ", 600));
        lista.add(new EntregaInternacional("NYC", 10000));

        for (Entrega e : lista) {
            System.out.println(e.getDestino());
        }

        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
    }
}
