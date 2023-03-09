public class Pais {
    private String nombrePais;
    private String continente;
    private int habitantes;

    public Pais() {
    }

    public Pais(String nombrePais, String continente, int habitantes) {
        this.nombrePais = nombrePais;
        this.continente = continente;
        this.habitantes = habitantes;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombrePais='" + nombrePais + '\'' +
                ", continente='" + continente + '\'' +
                ", habitantes=" + habitantes +
                '}';
    }

    public void exportar(){
        System.out.println("Exportando productos...");
    }

    public void importar(){
        System.out.println("Importando productos...");
    }

}
