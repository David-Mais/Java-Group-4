import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(
//                getClass().getResource("davaleba1/close.fxml")
//        );

        Parent root = FXMLLoader.load(
                getClass().getResource("davaleba2/start.fxml")
        );
        Scene scene = new Scene(root);

        stage.setScene(scene);
//        stage.setOnCloseRequest(Event::consume);
        stage.show();
    }
}