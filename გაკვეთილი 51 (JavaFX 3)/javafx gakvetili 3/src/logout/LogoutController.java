package logout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogoutController {
    @FXML
    private AnchorPane background;

    public void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("თქვენ აკეთებთ LogOut-ს");
        alert.setContentText("დარწმუნებული ხარ?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage =
                    (Stage) background
                            .getScene()
                            .getWindow();
            stage.close();
        }
    }
}
