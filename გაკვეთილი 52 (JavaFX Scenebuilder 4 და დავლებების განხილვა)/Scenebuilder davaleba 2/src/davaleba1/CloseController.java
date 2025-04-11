package davaleba1;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class CloseController {
    private int counter = 0;
    public void close(ActionEvent event) {
        counter++;
        if (counter >= 5) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Close");
            alert.setHeaderText("You are now closed");

            if (alert.showAndWait().get() == ButtonType.OK) {
//                System.exit(0);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.close();
            } else {
                counter = 0;
            }
        }
    }
}
