import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final DatabaseConnectionManager dcm = new DatabaseConnectionManager();
    private final String INSERT_USER = "INSERT INTO users (first_name, last_name) VALUES (?, ?)";
    private final String FIND_ALL = "SELECT * FROM users";
    private final String FIND_BY_ID = "SELECT * FROM users WHERE id = ?";
    private final String UPDATE = "UPDATE users SET first_name = ?, last_name = ? WHERE id = ?";
    private final String DELETE = "DELETE FROM users WHERE id = ?";

    @Override
    public void createUser(User user) {
        String firstName = user.getFirstName();
        String lastName = user.getLastName();

        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_USER);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<User> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();
            List<User> users = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString(3);

                User user = new User(id, firstName, lastName);

                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }

    @Override
    public User findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            User user = null;

            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                user = new User(id, firstName, lastName);
            }
            return user;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void updateUser(User user) {
        try (Connection con = dcm.getConnection()) {
            int id = user.getId();
            String firstName = user.getFirstName();
            String lastName = user.getLastName();

            PreparedStatement ps = con.prepareStatement(UPDATE);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setInt(3, id);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void deleteUser(int id) {
        try (
                PreparedStatement ps = dcm
                        .getConnection()
                        .prepareStatement(DELETE)
        ) {
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
