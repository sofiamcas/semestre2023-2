import java.awt.*;

public class Lampara {
    private Color colorLuz;
    private float precio;
    private String tipo;

    public Lampara() {
    }

    public Lampara(Color colorLuz, float precio, String tipo) {
        this.colorLuz = colorLuz;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Color getColorLuz() {
        return colorLuz;
    }

    public void setColorLuz(Color colorLuz) {
        this.colorLuz = colorLuz;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "colorLuz=" + colorLuz +
                ", precio=" + precio +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public boolean encender(){
        System.out.println("Encendiendo lampara...");
        return true;
    }

    public boolean apagar(){
        System.out.println("Apagando lampara...");
        return true;
    }
}
