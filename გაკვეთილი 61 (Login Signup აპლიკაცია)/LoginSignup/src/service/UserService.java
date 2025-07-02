package service;

import entities.User;

import java.time.LocalDate;

public interface UserService {
    void signUp(
            String firstName,
            String lastName,
            LocalDate dateOfBirth,
            String username,
            String password
    );

    User logIn(String username, String password);
}
