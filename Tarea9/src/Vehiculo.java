import java.awt.*;

public class Vehiculo {
    protected int numPuertas;
    protected int numLLantas;
    protected Color color;

    public Vehiculo() {
    }

    public Vehiculo(int numPuertas, int numLLantas, Color color) {
        this.numPuertas = numPuertas;
        this.numLLantas = numLLantas;
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumLLantas() {
        return numLLantas;
    }

    public void setNumLLantas(int numLLantas) {
        this.numLLantas = numLLantas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numPuertas=" + numPuertas +
                ", numLLantas=" + numLLantas +
                ", color=" + color +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo vehículo...");
    }

    public void apagar(){
        System.out.println("Apagando vehículo...");
    }
}
