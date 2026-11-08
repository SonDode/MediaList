package main;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:"+ Path.of("database", "sample.db").toAbsolutePath();

    public static Connection getConnection() throws SQLException {
        if(!Files.exists(Path.of("database", "sample.db"))){
            throw new SQLException("Database file was not found!");
        }

        return DriverManager.getConnection(URL);
    }
}
