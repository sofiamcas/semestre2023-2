package org.example;

import org.example.controlador.ControladorNatacion;
import org.example.vista.VentanaNatacion;

public class Main {
    public static void main(String[] args) {
        VentanaNatacion view = new VentanaNatacion("Natación");
        ControladorNatacion controller = new ControladorNatacion(view);
    }
}