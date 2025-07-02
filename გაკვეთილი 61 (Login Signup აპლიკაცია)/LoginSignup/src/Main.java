import dao.UserDao;
import dao.impl.UserDaoImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao.getAllUsers().forEach(System.out::println);
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent p = FXMLLoader.load(getClass().getResource("/scenes/login.fxml"));
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }
}
