import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneOneController {
    private Stage stage;
    private Scene scene;

    public void switchToSceneTwo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("scene2.fxml")
        );
        scene = new Scene(root);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneOne(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("scene1.fxml")
        );
        scene = new Scene(root);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
