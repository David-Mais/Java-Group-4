package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private final String url = "jdbc:postgresql://localhost:5432/mziuri";
    private final String user = "postgres";
    private final String password = "admin";

    public Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection(
                        url,
                        user,
                        password
                );
    }
}
