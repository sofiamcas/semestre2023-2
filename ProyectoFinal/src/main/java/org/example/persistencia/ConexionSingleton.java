package org.example.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Conexion a la base de datos / DataSouce

public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance;
    public Connection connection;

    private ConexionSingleton(String database) {
        this.baseDatos = database;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + this.baseDatos);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ConexionSingleton getInstance(String baseDatos) {
        if (_instance == null) {
            _instance = new ConexionSingleton(baseDatos);
        } else {
            System.out.println("Ya fué creada.");
        }
        return _instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

