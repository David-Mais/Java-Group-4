import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

//        try {
//            System.out.println(numbers[100]);
//            System.out.println("Hello World");
//        } catch (IndexOutOfBoundsException aioobe) {
//            System.out.println("მასივის საზღვრებს არ შეიძლება გავცდეთ");
//        }

//        try {
//            char a = "asdfasf".charAt(99);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("დავიჭირე მასივის საზღვერებს გარეთ ექსეფშნი");
//        } catch (Exception e) {
//            System.out.println("რაღაც სხვა ექსეფშენი");
//        }

//        try {
//            System.out.println(numbers[100]);
//            char a = "asdfasf".charAt(99);
//        } catch (
//                ArrayIndexOutOfBoundsException |
//                StringIndexOutOfBoundsException e
//        ) {
//            System.out.println("ინდექსს გავცდით!");
//        }


//        try {
//            int x = numbers[90];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ინდექსს გავცდით!");
//        } finally {
//            System.out.println("კარგად გავუმკლავდით ექსეფშენებს!");
//        }

//        System.out.println(printNumber());

//        int x = 0;
//        try {
//            x = numbers[100];
//        } catch (Exception e) {
//            System.out.println("ექსეფშენი მოხდა!");
//        } finally {
//            x = numbers[100];
//        }

//        readFile();


        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("ფაილი ვერ ვიპოვე!");
        }
    }

    static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("text.txt");
    }

//    static void readFile() {
//        try {
//            FileReader fileReader = new FileReader("text.txt");
//        } catch (IOException e) {
//            System.out.println("ფაილი ვერ ვიპოვე");
//        }
//    }

    static int printNumber() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}