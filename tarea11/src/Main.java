import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Caja con genéricos------");
        Caja<String> miCaja = new Caja<>(new String[10]);
        miCaja.add(0,"hola");
        miCaja.add(1,"adios");
        miCaja.add(2,"hi");
        System.out.println(miCaja);

        String temp = miCaja.get(0);


        System.out.println("------Caja sin genéricos-------");
        CajaSinGenericos CajaSin = new CajaSinGenericos(new Object[10]);
        CajaSin.add(0,"hola");
        CajaSin.add(1,"adios");
        CajaSin.add(2,"hii");
        System.out.println(CajaSin);
        //Forzas casting del tipo de dato que quieres en este caso el (String)

        String temp2 = (String) CajaSin.get(0);


        System.out.println("------comida------");
        Caja<Comida> comidaCaja = new Caja<>(new Comida[10]);
        comidaCaja.add(0, new Comida("yogurth",true));
        System.out.println(comidaCaja.get(0));


        System.out.println("------Arraylist------");
        ArrayList<Comida> comidas = new ArrayList<>(); //no tiene límite de elementos, se pueden agregar y eliminar
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Manzana", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(13));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Yogurt", true));
        comidas2.add(new Comida("Danonino", true));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Bistec", false));
        System.out.println(comidas2.get(3));
        comidas2.set(3,new Comida("fresa", false));
        comidas2.add(3, new Comida("naranja", false));

        System.out.println("------final------");
        //foreche, itera sobre todos los elementos del arreglo
        for (Comida comida: comidas2) {
            System.out.println(comida);
        }
    }
}