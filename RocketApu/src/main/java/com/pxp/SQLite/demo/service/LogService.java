package com.pxp.SQLite.demo.service;

import com.pxp.SQLite.demo.dbconection.DatabaseConnection;
import com.pxp.SQLite.demo.entity.LogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class LogService {

    private final DatabaseConnection dbConnection;

    public LogService() {
        this.dbConnection = DatabaseConnection.getInstance();
    }

    public void consultarLogsDeNavegacion(int id) {
        //conexion de bd
        Connection connection = dbConnection.getConnection();
        if (connection == null) {
            System.err.println("Error: No se pudo conectar a la base de datos.");
            return;
        }

        try {
            // Consulta SQL
            String sql = "SELECT * FROM RocketLogs WHERE id = id";

            // Crear una declaración preparada para ejecutar la consulta
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            // Ejecutar la consulta y obtener el resultado
            ResultSet resultSet = statement.executeQuery();

            // Procesar los resultados
            while (resultSet.next()) {
                // Obtener valores de las columnas
                int logId = resultSet.getInt("id");
                String altitude = resultSet.getString("altitude");
                // Procesar otros valores según las columnas de tu tabla

                // Ejemplo: Imprimir los resultados
                System.out.println("ID: " + logId + ", altitud: " + altitude);
            }
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            dbConnection.closeConnection();
        }
    }
}