import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(arr[100]);
//        System.out.println("Hello World!");

//        try {
//            FileReader fr = new FileReader("data.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }

//        try {
//            readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }

//        readFile();


        Scanner sc = new Scanner(System.in);
//        String text = sc.nextLine();
//        if (text.length() < 5) {
//            throw new ShortStringException();
//        }

//        try {
//            String text = sc.nextLine();
//            if (text.length() < 5) {
//                throw new ShortStringException();
//            }
//        } catch (ShortStringException e) {
//            System.out.println("String too short");
//            System.err.println(e);
//            System.err.println(e.getMessage());
//        }

        try {
            String text = sc.nextLine();
            int length = text.length();
            if (length < 5) {
                throw new ShortStringException("String of length " + length + " is too short");
            }
        } catch (ShortStringException e) {
            System.out.println("String too short");
            System.err.println(e);
            System.err.println(e.getMessage());
        }
    }

    public static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("data.txt");
    }
}