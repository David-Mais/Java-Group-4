package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class UserController {
    @FXML
    private TextField usernameField;

    public void login(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        System.out.println(username);

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("info.fxml")
        );
        Parent root = loader.load();

        InfoController infoController = loader.getController();
        infoController.greet(username);

        Stage stage = (Stage)
                ((Node) event.getSource())
                        .getScene()
                        .getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
