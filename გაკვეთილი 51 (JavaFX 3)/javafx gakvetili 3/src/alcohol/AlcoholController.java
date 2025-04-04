package alcohol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AlcoholController {
    @FXML
    private Label statusLabel;
    @FXML
    private TextField ageTextField;

    public void submit(ActionEvent event) {
        int age = 0;

        try {
            age = Integer.parseInt(ageTextField.getText());
            statusLabel.setStyle("-fx-text-fill: black");
            if (age < 18) {
                statusLabel.setText("პატარა ხარ!");
            } else {
                statusLabel.setText("ინებეთ!");
            }
        } catch (NumberFormatException e) {
            statusLabel.setStyle("-fx-text-fill: red");
            statusLabel.setText("შეიყვანე სწორი ასაკი!!!");
        }
    }
}
