package davaleba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class ColorController {
    @FXML
    private AnchorPane background;

    public void changeBackgroundColor(ActionEvent event) {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
//        background.setStyle(
//                "-fx-background-color: rgb(" + red + ", " + green + ", " + blue + ");"
//        );
        background.setStyle(
                String.format("-fx-background-color: rgb(%d, %d, %d);", red, green, blue)
        );

    }
}
