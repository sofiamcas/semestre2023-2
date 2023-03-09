public class Giroscopio {
    private String orientacion;
    private String utilidad;
    private String marca;

    public Giroscopio() {
    }

    public Giroscopio(String orientacion, String utilidad, String marca) {
        this.orientacion = orientacion;
        this.utilidad = utilidad;
        this.marca = marca;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "orientacion='" + orientacion + '\'' +
                ", utilidad='" + utilidad + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void ubicar(){
        System.out.println("Ubicando con giroscopio...");
    }

    public void medir(){
        System.out.println("Midiendo con giroscopio...");
    }
}
