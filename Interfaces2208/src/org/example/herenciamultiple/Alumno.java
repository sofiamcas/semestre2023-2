package org.example.herenciamultiple;

public class Alumno extends Persona{
    private int numCuenta;
    private String carrara;
    private double promedio;

    public Alumno() {
    }

    public Alumno(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Alumno(String nombre, int edad, int numCuenta) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
    }


    public Alumno(String nombre, int edad, int numCuenta, String carrara, double promedio) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.carrara = carrara;
        this.promedio = promedio;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrara() {
        return carrara;
    }

    public void setCarrara(String carrara) {
        this.carrara = carrara;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numCuenta=" + numCuenta +
                ", carrara='" + carrara + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
