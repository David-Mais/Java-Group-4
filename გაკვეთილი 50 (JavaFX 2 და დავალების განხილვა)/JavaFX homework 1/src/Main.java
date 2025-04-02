import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    // 1
//    @Override
//    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root, Color.CYAN);
//
//
//        Text text = new Text("გამარჯობა, ეს არის აპლიკაცია!");
//        text.setFont(Font.font(40));
//        text.setFill(Color.rgb(255, 0, 0));
//        text.setX(50);
//        text.setY(50);
//        root.getChildren().add(text);
//
//
//        Image icon = new Image("discord.png");
//        stage.setScene(scene);
//        stage.getIcons().add(icon);
//        stage.setTitle("Discord");
//        stage.setWidth(500);
//        stage.setHeight(500);
//        stage.setResizable(false);
//        stage.show();
//    }


    // 2
//    @Override
//    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root);
//
//        Rectangle square = new Rectangle();
//        square.setX(0);
//        square.setY(0);
//        square.setWidth(100);
//        square.setHeight(100);
//        root.getChildren().add(square);
//
//        Line d1 = new Line();
//        d1.setStartX(0);
//        d1.setStartY(0);
//        d1.setEndX(100);
//        d1.setEndY(100);
//        d1.setStroke(Color.YELLOW);
//        root.getChildren().add(d1);
//
//        Line d2 = new Line();
//        d2.setStartX(0);
//        d2.setStartY(100);
//        d2.setEndX(100);
//        d2.setEndY(0);
//        d2.setStroke(Color.YELLOW);
//        root.getChildren().add(d2);
//
//
//        Line side1 = new Line();
//        side1.setStartX(200);
//        side1.setStartY(200);
//        side1.setEndX(350);
//        side1.setEndY(200);
//        side1.setStroke(Color.BLUE);
//        side1.setStrokeWidth(5);
//        root.getChildren().add(side1);
//
//        Line side2 = new Line();
//        side2.setStartX(200);
//        side2.setStartY(200);
//        side2.setEndX(200);
//        side2.setEndY(250);
//        side2.setStroke(Color.BLUE);
//        side2.setStrokeWidth(5);
//        root.getChildren().add(side2);
//
//        Line side3 = new Line();
//        side3.setStartX(200);
//        side3.setStartY(250);
//        side3.setEndX(350);
//        side3.setEndY(250);
//        side3.setStroke(Color.BLUE);
//        side3.setStrokeWidth(5);
//        root.getChildren().add(side3);
//
//        Line side4 = new Line();
//        side4.setStartX(350);
//        side4.setStartY(200);
//        side4.setEndX(350);
//        side4.setEndY(250);
//        side4.setStroke(Color.BLUE);
//        side4.setStrokeWidth(5);
//        root.getChildren().add(side4);
//
//        stage.setScene(scene);
//        stage.setWidth(800);
//        stage.setHeight(600);
//        stage.show();
//    }


    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);

        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(100);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);
        root.getChildren().add(circle);

        Line mouth = new Line();
        mouth.setStartX(220);
        mouth.setStartY(300);
        mouth.setEndX(280);
        mouth.setEndY(300);
        mouth.setStrokeWidth(10);
        root.getChildren().add(mouth);

        Circle rightEye = new Circle();
        rightEye.setCenterX(200);
        rightEye.setCenterY(220);
        rightEye.setRadius(20);
        root.getChildren().add(rightEye);

        Circle leftEye = new Circle();
        leftEye.setCenterX(300);
        leftEye.setCenterY(220);
        leftEye.setRadius(20);
        root.getChildren().add(leftEye);


        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }
}