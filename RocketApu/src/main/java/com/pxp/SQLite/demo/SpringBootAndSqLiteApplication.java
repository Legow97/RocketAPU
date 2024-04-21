package com.pxp.SQLite.demo;

import com.pxp.SQLite.demo.dbconection.DatabaseConnection;
import com.pxp.SQLite.demo.entity.LogEntity;
import com.pxp.SQLite.demo.repository.LogRepository;
import com.pxp.SQLite.demo.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class SpringBootAndSqLiteApplication implements CommandLineRunner {

	@Autowired
	private LogRepository logRepository;
	@Autowired
	private LogService logService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAndSqLiteApplication.class, args);

		DatabaseConnection dbConnection = DatabaseConnection.getInstance();

		// conexión a la base de datos
		Connection connection = dbConnection.getConnection();

		// Aquí puedes realizar operaciones con la conexión a la base de datos

		try {
			// Consulta SQL
			String sql = "SELECT * FROM RocketLogs WHERE id = 4";

			// Crear una declaración preparada para ejecutar la consulta
			PreparedStatement statement = connection.prepareStatement(sql);

			// Ejecutar la consulta y obtener el resultado
			ResultSet resultSet = statement.executeQuery();

			// Procesar los resultados
			while (resultSet.next()) {
				// Obtener valores de las columnas
				int id = resultSet.getInt("id");
				String altitude = resultSet.getString("altitude");
				// Procesar otros valores según las columnas de tu tabla


				System.out.println("ID: " + id + ", altitud: " + altitude);
			}
		} catch (SQLException e) {
			System.err.println("Error al ejecutar la consulta: " + e.getMessage());
		} finally {
			// Cerrar recursos
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.err.println("Error al cerrar la conexión: " + e.getMessage());
			}
		}
		// Cuando hayas terminado, asegúrate de cerrar la conexión
		dbConnection.closeConnection();
	}


	@Override
	public void run(String... args) throws Exception {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int numero = scanner.nextInt();
		System.out.println("El número que introdujiste es: " + numero);
		scanner.close();
		logService.consultarLogsDeNavegacion(numero);
		var time = logRepository.findById(2).get();*/

	}

}
