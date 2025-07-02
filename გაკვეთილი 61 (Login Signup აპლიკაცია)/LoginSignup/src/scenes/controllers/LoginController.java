package scenes.controllers;

import entities.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import service.UserService;
import service.impl.UserServiceImpl;

public class LoginController {
    @FXML
    private Label statusLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;

    private final UserService userService = new UserServiceImpl();

    public void login(ActionEvent actionEvent) {
        try {
            User u = userService.logIn(
                    usernameTextField.getText(),
                    passwordTextField.getText()
            );
            System.out.println(u);
            statusLabel.setText("Hello, " + u.getFirstName() + " " + u.getLastName());
        } catch (IllegalArgumentException e) {
            statusLabel.setText(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void switchToSignUpScene(ActionEvent actionEvent) {

    }
}
