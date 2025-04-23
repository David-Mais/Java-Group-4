package menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController {
    @FXML
    private AnchorPane background;


    public void close(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Close");
        alert.setHeaderText("Are you sure you want to close?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage = (Stage) background.getScene().getWindow();
            stage.close();
        }
    }
}
