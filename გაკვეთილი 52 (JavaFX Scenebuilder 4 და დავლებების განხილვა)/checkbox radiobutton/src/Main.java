import javafx.application.Application;
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
        // 1
//        Parent root = FXMLLoader.load(getClass().getResource("light/light.fxml"));

        // 2
        Parent root = FXMLLoader.load(
                getClass().getResource("exam/exam.fxml")
        );
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}