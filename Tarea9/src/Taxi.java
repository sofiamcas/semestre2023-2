import java.awt.*;

public class Taxi extends Automovil {
    private String nombreConductor;
    private String licencia;
    private int numPasajeros;

    public Taxi() {
    }

    public Taxi(int numPuertas, int numLLantas, Color color, String marca, String modelo, int anio, String nombreConductor, String licencia, int numPasajeros) {
        super(numPuertas, numLLantas, color, marca, modelo, anio);
        this.nombreConductor = nombreConductor;
        this.licencia = licencia;
        this.numPasajeros = numPasajeros;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "nombreConductor='" + nombreConductor + '\'' +
                ", licencia='" + licencia + '\'' +
                ", numPasajeros=" + numPasajeros +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", numPuertas=" + numPuertas +
                ", numLLantas=" + numLLantas +
                ", color=" + color +
                '}';
    }
    public void recogerPasajero(){
        System.out.println("Recogiendo a pasajero...");
    }
    public void dejarPasajero(){
        System.out.println("Dejando en destino a pasajero...");
    }
}
