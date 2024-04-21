package com.pxp.SQLite.demo.dbconection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DATABASE_URL = "jdbc:sqlite:C:\\Users\\COMPUTER\\Desktop\\DBSQLite\\dblogs.db";

    private static DatabaseConnection instance;

    // Conexión a la base de datos
    private Connection connection;

    // Constructor
    private DatabaseConnection() {
        try {
            // Establecer la conexión a la base de datos
            connection = DriverManager.getConnection(DATABASE_URL);
            System.out.println("Conexión establecida con la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Método para obtener la instancia única de la conexión (Singleton)
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            // Crear una nueva instancia si no existe
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Método para obtener la conexión a la base de datos
    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
