package davaleba1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallController {
    @FXML
    private Circle circle;
    private Color[] colors = {Color.AQUAMARINE, Color.RED, Color.GREEN, Color.BLUE, Color.BLUEVIOLET};
    private int pointer;

    public void up(ActionEvent event) {
        circle.setCenterY(
                circle.getCenterY() - 5
        );
    }

    public void down(ActionEvent event) {
        circle.setCenterY(
                circle.getCenterY() + 5
        );
    }

    public void left(ActionEvent event) {
        circle.setCenterX(
                circle.getCenterX() - 5
        );
    }

    public void right(ActionEvent event) {
        circle.setCenterX(
                circle.getCenterX() + 5
        );
    }

    public void topRight(ActionEvent event) {
        circle.setCenterY(
                circle.getCenterY() - 5
        );
        circle.setCenterX(
                circle.getCenterX() + 5
        );
    }

    public void bottomRight(ActionEvent event) {
        circle.setCenterY(
                circle.getCenterY() + 5
        );
        circle.setCenterX(
                circle.getCenterX() + 5
        );
    }

    public void bottomLeft(ActionEvent event) {
        circle.setCenterY(
                circle.getCenterY() + 5
        );
        circle.setCenterX(
                circle.getCenterX() - 5
        );
    }

    public void topLeft(ActionEvent event) {
        circle.setCenterY(
                circle.getCenterY() - 5
        );
        circle.setCenterX(
                circle.getCenterX() - 5
        );
    }

    public void changeColor(ActionEvent event) {
        if (pointer >= colors.length) {
            pointer = 0;
        }
        circle.setFill(colors[pointer++]);
    }
}
