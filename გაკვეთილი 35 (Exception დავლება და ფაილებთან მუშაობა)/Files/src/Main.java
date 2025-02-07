import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // წაკითხვა

//        try {
////            FileReader fr = new FileReader("hello.txt");
////            BufferedReader br = new BufferedReader(fr);
//
//            BufferedReader br = new BufferedReader(
//                    new FileReader("hello.txt")
//            );
//
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//        } catch (FileNotFoundException e) {
//            System.err.println("ფაილი ვერ ვიპოვე!!!");
//        } catch (IOException e) {
//            System.err.println("წაკითხვა/ჩაწერისას პრობლემაა!!!");
//        }


//        try {
//            BufferedReader br = new BufferedReader(
//                    new FileReader("hello.txt")
//            );
//
//            String line;
//            System.out.println("ვიწყებ ფაილის წაკითხვას");
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            System.out.println("დავასრულე ფაილის წაკითხვა");
//
//            br.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("ფაილი ვერ ვიპოვე!!!");
//        } catch (IOException e) {
//            System.err.println("წაკითხვა/ჩაწერისას პრობლემაა!!!");
//        }


//        try (
//                BufferedReader br = new BufferedReader(
//                        new FileReader("hello.txt")
//                )
//        ) {
//            String line;
////            br.close();
//            System.out.println("ვიწყებ ფაილის წაკითხვას");
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            System.out.println("დავასრულე ფაილის წაკითხვა");
//        } catch (FileNotFoundException e) {
//            System.err.println("ფაილი ვერ ვიპოვე!!!");
//        } catch (IOException e) {
//            System.err.println("წაკითხვა/ჩაწერისას პრობლემაა!!!");
//        }


//        try (
//                BufferedReader br = new BufferedReader(
//                        new FileReader("smile.png")
//                )
//        ) {
//            String line;
//            System.out.println("ვიწყებ ფაილის წაკითხვას");
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            System.out.println("დავასრულე ფაილის წაკითხვა");
//        } catch (FileNotFoundException e) {
//            System.err.println("ფაილი ვერ ვიპოვე!!!");
//        } catch (IOException e) {
//            System.err.println("წაკითხვა/ჩაწერისას პრობლემაა!!!");
//        }


//        try {
//            Path path = Paths.get("hello.txt");
//            List<String> lines =  Files.readAllLines(path);
//
//            lines.forEach(System.out::println);
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }


        // ჩაწერა
//        try (
//                BufferedWriter bw = new BufferedWriter(
//                        new FileWriter("java_lesson.txt")
//                )
//        ) {
//            bw.write("Hello World");
//            bw.newLine();
//            bw.write("This is a lesson");
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }


//        try (
//                PrintWriter pw = new PrintWriter(
//                        "lesson2.txt"
//                )
//        ) {
//            pw.println("Hello World!");
//            pw.print("Hello World!");
//            pw.println("This is David here!");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


//        try (
//                Scanner scanner = new Scanner(
//                        new File("java_lesson.txt")
//                )
//        ) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }
}