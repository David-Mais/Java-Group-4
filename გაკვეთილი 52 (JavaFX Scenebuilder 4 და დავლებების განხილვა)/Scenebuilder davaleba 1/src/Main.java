import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 1
//        Parent root = FXMLLoader.load(
//                getClass().getResource("davaleba1/ball.fxml")
//        );
        // 2
//        Parent root = FXMLLoader.load(
//                getClass().getResource("davaleba2/color.fxml")
//        );
        // 3
        Parent root = FXMLLoader.load(
                getClass().getResource("davaleba3/jump.fxml")
        );
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}