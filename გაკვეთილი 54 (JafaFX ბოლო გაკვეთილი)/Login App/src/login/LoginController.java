package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    private final UserStorage storage = new UserStorage();
    @FXML
    private Label signupStatus;
    @FXML
    private TextField signupUsername, signupPassword, signupRePassword;

    @FXML
    private Label loginStatusLabel;
    @FXML
    private TextField loginUsernameTextField, loginPasswordTextField;

    public void signUp(ActionEvent event) {
        String username = signupUsername.getText();
        String password = signupPassword.getText();
        String rePassword = signupRePassword.getText();
        if (username.length() == 0) {
            signupStatus.setText("Please enter username");
            return;
        }
        if (password.length() == 0) {
            signupStatus.setText("Please enter password");
            return;
        }
        if (rePassword.length() == 0) {
            signupStatus.setText("Please re-enter password");
        }

        if (!password.equals(rePassword)) {
            signupStatus.setText("Passwords should match");
            return;
        }

        User user = new User(username, password);

        storage.addUser(user);
        storage.printUsers();
    }

    public void logIn(ActionEvent actionEvent) {
        User user = storage.getUser(
                loginUsernameTextField.getText()
        );
        System.out.println(user);

        if (user == null) {
            loginStatusLabel.setStyle("-fx-text-fill: red;");
            loginStatusLabel.setText(
                    "Invalid username or password"
            );
            return;
        }

        String password = loginPasswordTextField.getText();

        if (password.equals(user.getPassword())) {
            loginStatusLabel.setStyle("-fx-text-fill: green;");
            loginStatusLabel.setText(
                    "Login successful"
            );
        } else {
            loginStatusLabel.setStyle("-fx-text-fill: red;");
            loginStatusLabel.setText(
                    "Invalid username or password"
            );
        }
    }
}
