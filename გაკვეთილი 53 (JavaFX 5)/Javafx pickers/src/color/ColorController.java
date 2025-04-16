package color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class ColorController {
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private AnchorPane background;

    public void changeColor(ActionEvent event) {
        Color color = colorPicker.getValue();
        background.setBackground(
                new Background(
                        new BackgroundFill(color, null, null)
                )
        );
    }
}
