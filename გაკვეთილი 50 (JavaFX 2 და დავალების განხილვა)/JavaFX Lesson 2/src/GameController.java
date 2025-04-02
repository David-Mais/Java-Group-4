import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class GameController {
    @FXML
    private Circle myGameCircle;
    private double x;
    private double y;

    public void up() {
        myGameCircle.setCenterY(y -= 10);
        System.out.println("Up");
    }

    public void right() {
        myGameCircle.setCenterX(x += 10);
        System.out.println("Right");
    }

    public void down() {
        myGameCircle.setCenterY(y += 10);
        System.out.println("Down");
    }

    public void left() {
        myGameCircle.setCenterX(x -= 10);
        System.out.println("Left");
    }
}
