package shida_klasebi;

public class Main {
    public static void main(String[] args) {
//        shida_klasebi.OuterClass outer = new shida_klasebi.OuterClass("Hello!");
//        outer.printText();
////        outer.printAnotherText();
//
//        shida_klasebi.OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.printAnotherText();
////        inner.printText();


//        shida_klasebi.OuterClass2.InnerClass2 innerClass2 = new shida_klasebi.OuterClass2.InnerClass2();

//        createClassAndPrintSomething("Hello this is David!");

        Car car = new Car("BMW", "M4", 456);
        car.getEngineInfo();
    }

    public static void createClassAndPrintSomething(String text) {
        class Something {
            public void print(String text) {
                System.out.println(text);
            }
        }

        Something something = new Something();
        something.print(text);
    }
}