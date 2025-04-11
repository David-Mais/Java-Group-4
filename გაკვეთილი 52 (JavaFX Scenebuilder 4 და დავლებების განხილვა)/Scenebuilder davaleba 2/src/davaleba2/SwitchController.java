package davaleba2;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchController {
    public void green(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("green.fxml")
        );
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void red(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("red.fxml")
        );
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void yellow(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("yellow.fxml")
        );
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void goBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("start.fxml")
        );
        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
