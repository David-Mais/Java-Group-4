package dao.impl;

import dao.UserDao;
import db.DatabaseConnectionManager;
import entities.User;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    DatabaseConnectionManager dcm = new DatabaseConnectionManager();
    private final String INSERT = "INSERT INTO users (first_name, last_name, dob, username, password) VALUES (?, ?, ?, ?, ?);";
    private final String SELECT_ALL = "SELECT * FROM users;";
    private final String GET_BY_USERNAME = "SELECT * FROM users WHERE username = ?";

    @Override
    public void addUser(User user) {
        try (
                PreparedStatement ps = dcm
                        .getConnection()
                        .prepareStatement(INSERT)
        ) {
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setDate(3, Date.valueOf(user.getDateOfBirth()));
            ps.setString(4, user.getUsername());
            ps.setString(5, user.getPassword());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        try (
                PreparedStatement ps = dcm
                        .getConnection()
                        .prepareStatement(SELECT_ALL);
                ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getDate("dob").toLocalDate(),
                        rs.getString("username"),
                        rs.getString("password")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving users: " + e.getMessage());
            e.printStackTrace();
        }

        return users;
    }


    @Override
    public User getUserByUsername(String username) {
        try (
                PreparedStatement ps = dcm
                        .getConnection()
                        .prepareStatement(GET_BY_USERNAME)
        ) {
            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getDate("dob").toLocalDate(),
                            rs.getString("username"),
                            rs.getString("password")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}
