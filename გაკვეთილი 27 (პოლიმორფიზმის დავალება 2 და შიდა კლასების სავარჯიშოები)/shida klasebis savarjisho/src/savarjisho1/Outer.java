package savarjisho1;

public class Outer {
    private String message = "Hello I am David";

    public class Inner {
        public void printMessage() {
            System.out.println(message);
        }
    }
}
