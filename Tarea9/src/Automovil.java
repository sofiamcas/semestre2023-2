import java.awt.*;

public class Automovil extends Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Automovil() {
    }

    public Automovil(int numPuertas, int numLLantas, Color color, String marca, String modelo, int anio) {
        super(numPuertas, numLLantas, color);
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public void acelerar(){
        System.out.println("El automóvil está acelerando...");
    }

    public void frenar(){
        System.out.println("El automovil está frenando...");
    }
}
