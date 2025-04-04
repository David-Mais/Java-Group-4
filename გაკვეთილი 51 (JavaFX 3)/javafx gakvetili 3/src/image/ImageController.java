package image;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {
    @FXML
    private ImageView imageView;

    private final Image[] images = {
            new Image(getClass().getResourceAsStream("/image/facebook.png")),
            new Image(getClass().getResourceAsStream("/image/github.png")),
            new Image(getClass().getResourceAsStream("/image/instagram.png")),
            new Image(getClass().getResourceAsStream("/image/twitch.png"))
    };
    private int pointer = 0;

    private Image getImage() {
        if (pointer == images.length) {
            pointer = 0;
        }
        return images[pointer++];
    }

    public void next(ActionEvent event) {
        imageView.setImage(getNext());
    }

    public void previous(ActionEvent event) {
        imageView.setImage(getPrevious());
    }

    public Image getNext() {
        pointer++;
        if (pointer >= images.length) {
            pointer = 0;
        }
        return images[pointer];
    }

    public Image getPrevious() {
        pointer--;
        if (pointer < 0) {
            pointer = images.length - 1;
        }

        return images[pointer];
    }
}
