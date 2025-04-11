package light;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LightController {
    @FXML
    private ImageView imageView;
    @FXML
    private Label label;
    @FXML
    private CheckBox checkBox;

    private Image on = new Image(getClass().getResourceAsStream("/light/on.png"));
    private Image off = new Image(getClass().getResourceAsStream("/light/off.png"));

    public void toggle(ActionEvent event) {
        if (checkBox.isSelected()) {
            imageView.setImage(on);
            label.setText("On");
        } else {
            imageView.setImage(off);
            label.setText("Off");
        }
    }
}
