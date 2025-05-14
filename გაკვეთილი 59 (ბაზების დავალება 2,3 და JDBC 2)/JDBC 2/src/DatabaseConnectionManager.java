import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private final String url;
    private final String username;
    private final String password;

    public DatabaseConnectionManager() {
        this.url = "jdbc:postgresql://localhost:5432/mziuri";
        this.username = "postgres";
        this.password = "admin";
    }

    public Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection(
                        url,
                        username,
                        password
                );
    }
}
