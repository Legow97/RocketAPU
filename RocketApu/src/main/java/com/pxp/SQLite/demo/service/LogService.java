package com.pxp.SQLite.demo.service;

import com.pxp.SQLite.demo.SpringBootAndSqLiteApplication;
import com.pxp.SQLite.demo.dbconection.DatabaseConnection;
import com.pxp.SQLite.demo.entity.LogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

    public LogEntity getLog(String id){

        String query = "SELECT * FROM RocketLogs WHERE id = "+id ;
        LogEntity log = new LogEntity();

        // Obtener la conexión desde DatabaseConnection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();

        try (PreparedStatement statement = dbConnection.getConnection().prepareStatement(query)) {

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                // Crear un objeto Product por cada fila del resultado
                log.setId(resultSet.getInt("id"));
                log.setAltitude(resultSet.getDouble("altitude"));
                log.setVerticalVelocity(resultSet.getDouble("verticalVelocity"));
                log.setVerticalacceleration(resultSet.getDouble("verticalacceleration"));
                log.setTotalVelocity(resultSet.getDouble("totalVelocity"));
                log.setTotalAcceleration(resultSet.getDouble("totalAcceleration"));
                log.setLatitude(resultSet.getDouble("latitude"));
                log.setLongitude(resultSet.getDouble("longitude"));
                log.setGravitalAcceleration(resultSet.getDouble("gravitalAcceleration"));
                log.setMotorMass(resultSet.getDouble("motorMass"));
                log.setLongitudinalMomentInertial(resultSet.getDouble("longitudinalMomentInertial"));
                log.setRotationalMomentInertial(resultSet.getDouble("rotationalMomentInertial"));
                log.setFrictionDrag(resultSet.getDouble("frictionDrag"));
                log.setPressureDrag(resultSet.getDouble("pressureDrag"));
                log.setBaseDrag(resultSet.getDouble("baseDrag"));
                log.setVerticalOrientation(resultSet.getDouble("verticalOrientation"));
                log.setLateralOrientation(resultSet.getDouble("lateralOrientation"));
                log.setWindVelocity(resultSet.getDouble("windVelocity"));
                log.setAirTemperature(resultSet.getDouble("airTemperature"));
                log.setAirPressure(resultSet.getDouble("airPressure"));
            }

        } catch (SQLException e) {
            System.err.println("Error durante la consulta: " + e.getMessage());
        }

        dbConnection.closeConnection();
        // Retornar la lista de productos
        return log;
    }
}