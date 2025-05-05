import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(25, 25, 50.0));
        lista.add(new Circulo(54, 65, 80.0));
        lista.add(new Cilindro(40, 75, 70.0, 60.0));
        lista.add(new Cilindro(20, 45, 43.0, 90.0));

        for(Forma f : lista){

            if(f instanceof Circulo){
                System.out.println("Circulo");
            }
            else {
                System.out.println("Cinlindro");
            }

            System.out.println(f.getClass());
            System.out.println(f);
            System.out.println("área = " + f.calcularArea());

            if(f instanceof Volume){
                System.out.println("Volume " + ((Volume) f).calcularVolume());

            }
            System.out.println("---------------------------");
        }

    }
}