public class CuboRubik {
    private String forma;
    private int tamano;
    private String dificultad;

    public CuboRubik() {
    }

    public CuboRubik(String forma, int tamano, String dificultad) {
        this.forma = forma;
        this.tamano = tamano;
        this.dificultad = dificultad;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "forma='" + forma + '\'' +
                ", tamano=" + tamano +
                ", dificultad='" + dificultad + '\'' +
                '}';
    }

    public boolean armar(){
        System.out.println("Armando cuboRubik...");
        return true;
    }

    public boolean desarmar(){
        System.out.println("Desarmando cuboRubik...");
        return true;
    }
}
