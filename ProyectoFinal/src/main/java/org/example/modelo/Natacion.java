package org.example.modelo;


//Almacena información que venga de base de datos

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Natacion {
    private int id;
    private String nadador;
    private int edad;
    private String nacionalidad;
    private int medallas;
    private String imagen;

    public Natacion() {
    }

    public Natacion(int id, String nadador, int edad, String nacionalidad, int medallas, String imagen) {
        this.id = id;
        this.nadador = nadador;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.medallas = medallas;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNadador() {
        return nadador;
    }

    public void setNadador(String nadador) {
        this.nadador = nadador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    //getImagen
    public String getImagen() {
        return imagen;
    }


    public void setUrlImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Natacion{" +
                "id=" + id +
                ", nadador='" + nadador + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", medallas=" + medallas +
                ", imagen='" + imagen + '\'' +
                '}';
    }

    public ImageIcon getImage() throws MalformedURLException{
        URL urlImagen = new URL(this.imagen);
        return new ImageIcon(urlImagen);
    }
}
