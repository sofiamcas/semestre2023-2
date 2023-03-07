import java.awt.*;

public class Pluma {
    private float capacidad;
    private float longitud;
    private String marca;
    private Color color;

    public Pluma() {
    }

    public Pluma(float capacidad, float longitud, String marca, Color color) {
        this.capacidad = capacidad;
        this.longitud = longitud;
        this.marca = marca;
        this.color = color;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pluma{" +
                "capacidad=" + capacidad +
                ", longitud=" + longitud +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void pintar(){
        System.out.println("Escribiendo con pluma marca " + marca );
    }

    public void cambiar(){
        System.out.println("Cambiando depósito de la pluma");
    }

    public void setlongitud(float len){
        System.out.println("Escribiendo con pluma longitud " + longitud);
    }
}
