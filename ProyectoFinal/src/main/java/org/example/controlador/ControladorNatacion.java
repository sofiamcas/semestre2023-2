package org.example.controlador;

import org.example.modelo.ModeloTablaNatacion;
import org.example.modelo.Natacion;
import org.example.vista.VentanaNatacion;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorNatacion extends MouseAdapter {
    private VentanaNatacion view;
    private ModeloTablaNatacion modelo;

    public ControladorNatacion(VentanaNatacion view){
        this.view = view;
        modelo = new ModeloTablaNatacion();
        this.view.getTblNatacion().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblNatacion().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTblNatacion().setModel(modelo);
            this.view.getTblNatacion().updateUI();
        }

        if (e.getSource() == this.view.getBtnAgregar()){
            Natacion natacion = new Natacion();
            natacion.setId(0);
            natacion.setNadador(this.view.getTxtNadador().getText());
            natacion.setEdad(Integer.parseInt(this.view.getTxtEdad().getText()));
            natacion.setNacionalidad(this.view.getTxtNacionalidad().getText());
            natacion.setMedallas(Integer.parseInt(this.view.getTxtMedallas().getText()));
            natacion.setUrlImagen(this.view.getTxtImagen().getText());
            if (modelo.agregarNatacion(natacion)){
                JOptionPane.showMessageDialog(view, "Se agregó correctamente",
                        "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblNatacion().updateUI();
            }else {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos. Revise su conexion",
                        "Error al insertar",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        this.view.limpiar();


        if (e.getSource() == this.view.getTblNatacion()) {
            System.out.println("Evento sobre la Tabla");
            int index = this.view.getTblNatacion().getSelectedRow();
            Natacion tmp = modelo.getNatacionIndex(index);
            try {
                this.view.getLblFoto().setIcon(tmp.getImage());
            } catch (MalformedURLException mfue) {
                System.out.println(e.toString());
            }

            this.view.getTxtNadadorx().setText(tmp.getNadador());
            this.view.getTxtEdadx().setText(String.valueOf(tmp.getEdad()));
            this.view.getTxtNacionalidadx().setText(tmp.getNacionalidad());
            this.view.getTxtMedallasx().setText(String.valueOf(tmp.getMedallas()));
            this.view.getTxtImagenx().setText(String.valueOf(tmp.getImagen()));

        }

        if (e.getSource() == this.view.getBtnActualizar()){
            System.out.println("Evento sobre boton Actualizar");
            int rowIndex = this.view.getTblNatacion().getSelectedRow();
            Natacion tmp = modelo.getNatacionIndex(rowIndex);
            Natacion natacion = new Natacion();

            natacion.setNadador(this.view.getTxtNadadorx().getText());
            natacion.setEdad(Integer.parseInt(this.view.getTxtEdadx().getText()));
            natacion.setNacionalidad(this.view.getTxtNacionalidadx().getText());
            natacion.setMedallas(Integer.parseInt(this.view.getTxtMedallasx().getText()));
            natacion.setUrlImagen(this.view.getTxtImagenx().getText());
            natacion.setId(tmp.getId());

            if (modelo.actualizarNatacion(natacion)){
                JOptionPane.showMessageDialog(view, "Se actualizo el registro", "Aviso", JOptionPane.INFORMATION_MESSAGE );
                modelo.cargarDatos();
                this.view.getTblNatacion().setModel(modelo);
                this.view.getTblNatacion().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo actualizar el registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTblNatacion().updateUI();
        }

        if (e.getSource() == this.view.getBtnEliminar()){
            ModeloTablaNatacion temp = new ModeloTablaNatacion();
            int index = this.view.getTblNatacion().getSelectedRow();
            Natacion tmp = modelo.getNatacionIndex(index);

            if (temp.eliminarNatacion(Integer.toString(tmp.getId()))){
                JOptionPane.showMessageDialog(view,"Se elimino el registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.view.getTblNatacion().updateUI();
                this.view.limpiar();
            }else {
                JOptionPane.showMessageDialog(view, "No se elimino el registro","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.view.limpiar();
    }
}

