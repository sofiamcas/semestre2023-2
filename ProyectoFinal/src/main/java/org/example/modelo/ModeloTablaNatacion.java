package org.example.modelo;

import org.example.persistencia.NatacionDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaNatacion implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList <Natacion> datos;
    private NatacionDAO ldao;

    public ModeloTablaNatacion() {
        ldao = new NatacionDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaNatacion(ArrayList<Natacion> datos, NatacionDAO ndao){
        this.datos = datos;
        ldao = new NatacionDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";
            case 1:
                return "Nombre del nadador";
            case 2:
                return "Edad";
            case 3:
                return "Nacionalidad";
            case 4:
                return "Num. de medallas";
            case 5:
                return "Imagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Natacion tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNadador();
            case 2:
                return tmp.getEdad();
            case 3:
                return tmp.getNacionalidad();
            case 4:
                return tmp.getMedallas();
            case 5:
                return tmp.getImagen();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setNadador( (String) o);
                break;
            case 2:
                datos.get(rowIndex).setEdad( (Integer) o);
                break;
            case 3:
                datos.get(rowIndex).setNacionalidad( (String) o);
                break;
            case 4:
                datos.get(rowIndex).setMedallas( (Integer) o);
                break;
            case 5:
                datos.get(rowIndex).setUrlImagen( (String) o);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try {
            ArrayList<Natacion> tirar = ldao.obtenertodo();
            System.out.println(tirar);
            datos = ldao.obtenertodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarNatacion(Natacion natacion){
        boolean resultado = false;
        try {
            if (ldao.insertar(natacion)){
                datos.add(natacion);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public Natacion getNatacionIndex (int index){
        return datos.get(index);
    }

    public boolean actualizarNatacion(Natacion natacion){
        boolean resultado = true;
        try {
            if (ldao.update(natacion)){
                datos.add(natacion);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean eliminarNatacion(String id){
        boolean resultado = false;
        try {
            if (ldao.delete(id)){
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
}
