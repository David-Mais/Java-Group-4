import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        final String URL = "jdbc:postgresql://localhost:5432/mziuri";
//        final String USER = "postgres";
//        final String PASSWORD = "admin";
//        DatabaseConnectionManager dcm = new DatabaseConnectionManager(
//                URL, USER, PASSWORD
//        );

//        try {
//            Connection connection = dcm.getConnection();
//            System.out.println("წარმატებით ჩაიარა კავშირის გაბმამ");

//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
//            while (rs.next()) {
//                System.out.println(
//                        rs.getInt(1) + " " +
//                        rs.getString(2) + " " +
//                        rs.getString(3) + " " +
//                        rs.getInt(4)
//                );
//            }


//            Statement createTable = connection.createStatement();
//            createTable.executeUpdate(
//                                        """
//                                           CREATE TABLE jdbctest (
//                                           	id SERIAL PRIMARY KEY,
//                                           	first_name VARCHAR(50)
//                                           );
//                                           """);
//        } catch (SQLException e) {
//            System.err.println("დაკავშირება ვერ მოხერხდა!!!");
//            System.out.println(e.getMessage());
//        }


        UserDao userDao = new UserDaoImpl();
//        User user = new User(-1, "Davit", "Agmashenebeli");
//        userDao.createUser(user);

        List<User> users = userDao.findAll();
        users.forEach(System.out::println);
    }
}
