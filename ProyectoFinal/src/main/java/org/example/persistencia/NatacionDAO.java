package org.example.persistencia;

import org.example.modelo.Natacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NatacionDAO implements InterfazDAO{
    public NatacionDAO() {
    }
    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO natacion(nadador, edad, nacionalidad, medallas, imagen) VALUES (?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("natacionDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Natacion)obj).getNadador());
        pstm.setInt(2,((Natacion)obj).getEdad());
        pstm.setString(3,((Natacion)obj).getNacionalidad());
        pstm.setInt(4,((Natacion)obj).getMedallas());
        pstm.setString(5,((Natacion)obj).getImagen());
        rowCount = pstm.executeUpdate();
        return  rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE natacion SET nadador = ?, edad = ?, nacionalidad = ?, medallas = ?, imagen = ?  WHERE id = ? ;";
        int rowCount = 0; //numero de registros
        PreparedStatement pstm = ConexionSingleton.getInstance("natacionDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Natacion)obj).getNadador());
        pstm.setInt(2,((Natacion)obj).getEdad());
        pstm.setString(3,((Natacion)obj).getNacionalidad());
        pstm.setInt(4,((Natacion)obj).getMedallas());
        pstm.setString(5,((Natacion)obj).getImagen());
        pstm.setInt(6,((Natacion)obj).getId());
        rowCount = pstm.executeUpdate();
        return  rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM natacion WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("natacionDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenertodo() throws SQLException {
        String sql = "SELECT * FROM natacion";
        ArrayList<Natacion> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("natacionDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Natacion(rst.getInt(1), rst.getString(2), rst.getInt(3),
                    rst.getString(4),rst.getInt(5),rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM natacion WHERE id = ? ;";
        Natacion natacion = null;


        PreparedStatement pstm = ConexionSingleton.getInstance("natacionDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            natacion = new Natacion(rst.getInt(1), rst.getString(2), rst.getInt(3),
                    rst.getString(4), rst.getInt(5), rst.getString(6));
            return natacion;
        }
        return null;
    }
}
