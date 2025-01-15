import java.util.ArrayList;
import java.util.List;

public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor, boolean isMagical) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        accessories = new ArrayList<>();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void setMagical(boolean magical) {
        isMagical = magical;
    }

    public void decorate(String accessories) {
        this.accessories.add(accessories);
    }

    public void melt() {
        if (this.height == 0) {
            return;
        }
        this.height /= 2;
        if (this.height < 1) {
            this.height = 0;
        }
    }

    public void makeMagical() {
        this.isMagical = true;
    }

    @Override
    public String toString() {
        return "Snowman{" +
                "height=" + height +
                ", hatColor='" + hatColor + '\'' +
                ", isMagical=" + isMagical +
                ", accessories=" + accessories +
                '}';
    }
}
