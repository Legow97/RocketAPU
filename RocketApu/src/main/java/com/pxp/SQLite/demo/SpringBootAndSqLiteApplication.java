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
public class SpringBootAndSqLiteApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringBootAndSqLiteApplication.class, args);

    }
}


