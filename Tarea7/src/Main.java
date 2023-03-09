import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Pais pais = new Pais("Mexico", "Americano", 126000000);
        System.out.println(pais);
        pais.exportar();

        Giroscopio giro = new Giroscopio("Norte","medir", "SUHOMMY");
        System.out.println(giro);
        giro.medir();

        computadora compu = new computadora("HP", Color.BLACK, 33);
        System.out.println(compu);
        compu.apagar();

        CuboRubik cubo = new CuboRubik("Cubo", 5, "dificil");
        System.out.println(cubo);
        cubo.armar();

        Libro lib = new Libro("Java a Fondo", "programacion", 327);
        System.out.println(lib);
        lib.abrir();

        Balon bal = new Balon(13, Color.BLUE, "VOID");
        System.out.println(bal);
        bal.jugar();

        Lampara lamp = new Lampara(Color.MAGENTA, 1922, "Escritorio");
        System.out.println(lamp);
        lamp.encender();

        Gato cat = new Gato("Durazni", Color.ORANGE, 3);
        System.out.println(cat);
        cat.dormir();



    }
}