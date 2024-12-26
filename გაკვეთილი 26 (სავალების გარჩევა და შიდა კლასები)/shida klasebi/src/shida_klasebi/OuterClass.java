package shida_klasebi;

public class OuterClass {
    private String text;

    public OuterClass(String text) {
        this.text = text;
    }

    public void printText() {
        System.out.println(text);
//        System.out.println(anotherText);
//        printAnotherText()
    }

    public class InnerClass {
        private String anotherText = "asldkfjasldkf";

        public void printAnotherText() {
            System.out.println(anotherText);
//            System.out.println(text);
//            printText();
        }
    }
}
