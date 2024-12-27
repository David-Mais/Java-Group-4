package savarjisho3;

public class Test {
    public static void main(String[] args) {
        Shape rectangle = new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing rectangle");
            }

            @Override
            public void print() {
                System.out.println("Printing rectangle");
            }
        };

        rectangle.draw();
        rectangle.print();
    }
}
