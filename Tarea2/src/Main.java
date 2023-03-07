
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre Profesion País");
        String[] datos;
        String input = "";
        input = teclado.nextLine();
        datos = input.split(" ");

        String nombre = datos[0].toUpperCase();
        String profesion = datos[1].toUpperCase();
        String pais = datos[2].toUpperCase();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesion: " + profesion);
        System.out.println("País: " + pais);

    }
}