import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ColorsController {
    @FXML
    private AnchorPane background;
    private final String[] colors = {"green", "yellow", "red", "blue"};
    private int counter = 0;

//    public void changeColor() {
//        if (counter == colors.length) {
//            counter = 0;
//        }
//        background.setStyle("-fx-background-color: " + colors[counter] + ";");
//        counter++;
//    }

    public void changeColor() {
//        background.setStyle("-fx-background-color: rgb(156, 126, 44)");
        background.setStyle("-fx-background-color: #9c7e2c");
    }
}
