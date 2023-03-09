import java.awt.*;

public class Libro {
    private String titulo;
    private String genero;
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, String genero, int paginas) {
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public boolean abrir(){
        System.out.println("Abriendo libro...");
        return true;
    }

    public boolean cerrar(){
        System.out.println("Cerrando libro...");
        return true;
    }
}
