import java.awt.*;

public class Balon {
    private float circunferencia;
    private Color color;
    private String marca;

    public Balon() {
    }

    public Balon(float circunferencia, Color color, String marca) {
        this.circunferencia = circunferencia;
        this.color = color;
        this.marca = marca;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "circunferencia=" + circunferencia +
                ", color=" + color +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void jugar(){
        System.out.println("Jugando con balon...");
    }

    public void ponchar(){
        System.out.println("Ponchando balón");
    }
}
