package choice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceController implements Initializable {
    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private Label label;

    private String[] pets = {"Cat", "Dog", "Fish", "Horse", "Rabbit", "Tiger", "Wolf"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(pets);
        choiceBox.setOnAction(event -> getPet(event));
    }

    public void getPet(ActionEvent event) {
        String value = choiceBox.getValue();
        System.out.println(value);
        label.setText(value);
    }
}
