package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import entities.User;
import service.UserService;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoImpl();

    @Override
    public void signUp(
            String firstName,
            String lastName,
            LocalDate dateOfBirth,
            String username,
            String password
    ) {
        if (password.length() < 8) {
            throw new IllegalArgumentException(
                    "password must be at least 8 characters"
            );
        }

        User user = new User(
                firstName,
                lastName,
                dateOfBirth,
                username,
                password
        );
        userDao.addUser(user);
    }

    @Override
    public User logIn(String username, String password) {
        User user = userDao.getUserByUsername(username);

        if (username.isBlank() || password.isBlank()) {
            throw new IllegalArgumentException(
                    "Please enter a valid username/password"
            );
        }

        if (user == null) {
            throw new IllegalArgumentException(
                    "username or password is incorrect"
            );
        }

        if (!user.getPassword().equals(password)) {
            throw new IllegalArgumentException(
                    "username or password is incorrect"
            );
        }

        return user;
    }
}
