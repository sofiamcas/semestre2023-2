import java.awt.*;

public class computadora {
    private String marca;
    private Color color;
    private float tamano;

    public computadora() {
    }

    public computadora(String marca, Color color, float tamano) {
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
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

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "computadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", tamano=" + tamano +
                '}';
    }

    public boolean prender(){
        System.out.println("Prendiendo la computadora...");
        return true;
    }

    public boolean apagar(){
        System.out.println("Apagando la computadora...");
        return true;
    }

}
