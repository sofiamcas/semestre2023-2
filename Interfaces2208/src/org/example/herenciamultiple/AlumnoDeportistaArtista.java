package org.example.herenciamultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista {
    private int idActividadesExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numCuenta, String carrara, double promedio, int idActividadesExtra, String deporte, String arte) {
        super(nombre, edad, numCuenta, carrara, promedio);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividadesExtra() {
        return idActividadesExtra;
    }

    public void setIdActividadesExtra(int idActividadesExtra) {
        this.idActividadesExtra = idActividadesExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "idActividadesExtra=" + idActividadesExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String diciplina) {
        System.out.println("El alumno está ensayando " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + "está presentando su obra....");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " está entrenando el deporte " + deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " está en competencia  del deporte " + deporte);
        return true;
    }
}
