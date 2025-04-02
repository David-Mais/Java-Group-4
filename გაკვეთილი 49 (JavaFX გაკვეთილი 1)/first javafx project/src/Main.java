import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Group group = new Group();
//        Scene scene = new Scene(group);
//        Scene scene = new Scene(group, Color.CYAN);
//        Image icon = new Image("java.png");
//        stage.setScene(scene);
//        stage.setTitle("First javafx application");
//        stage.getIcons().add(icon);
//        stage.setWidth(500);
//        stage.setHeight(400);
//        stage.setResizable(false);
//        stage.setX(600);
//        stage.setY(600);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("დააჭირე x-ს რომ გამოხვიდე!");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("x"));
//        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("SHIFT+s"));
//        stage.show();





        // v2
        Group root = new Group();
        Scene scene = new Scene(root, 600,  600, Color.CYAN);

        Text text = new Text("Hello World");
        text.setX(100);
        text.setY(100);
//        text.setFont(Font.font("DialogInput", 50));
        text.setFont(Font.font(50));
        text.setFill(Color.rgb(128, 24, 107));
//        text.setFill(Color.valueOf("#4f0303"));
        root.getChildren().add(text);


        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(300);
        line.setStrokeWidth(20);
        line.setStroke(Color.RED);
//        root.getChildren().add(line);


        Rectangle rectangle = new Rectangle();
        rectangle.setX(60);
        rectangle.setY(400);
        rectangle.setWidth(300);
        rectangle.setHeight(150);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStroke(Color.RED);
        rectangle.setStrokeWidth(10);
//        root.getChildren().add(rectangle);


        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                225.0, 250.0,
                200.0, 300.0,
                300.0, 300.0
        );
        triangle.setFill(Color.CHOCOLATE);
//        root.getChildren().add(triangle);


        Circle circle = new Circle();
        circle.setCenterX(300);
        circle.setCenterY(300);
        circle.setRadius(100);
        circle.setFill(Color.GREEN);
//        root.getChildren().add(circle);


        Image image = new Image("java.png");
        ImageView iv = new ImageView(image);
        iv.setX(300);
        iv.setY(200);
        iv.setFitWidth(200);
        iv.setFitHeight(200);
        root.getChildren().add(iv);

        stage.setScene(scene);
        stage.show();
    }
}