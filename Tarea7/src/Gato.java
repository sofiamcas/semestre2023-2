import java.awt.*;

public class Gato {
    private String nombre;
    private Color color;
    private int edad;

    public Gato() {
    }

    public Gato(String nombre, Color color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", color=" + color +
                ", edad=" + edad +
                '}';
    }

    public void dormir(){
        System.out.println("Durmiendo...");
    }

    public void comer(){
        System.out.println("Comiendo...");
    }
}
