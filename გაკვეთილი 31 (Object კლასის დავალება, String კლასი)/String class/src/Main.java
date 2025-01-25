import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String animal = "cat";
//        String name = new String("Davit");
//        System.out.println(animal);
//        System.out.println(name);
//
//        char[] chars = {'h', 'e', 'l', 'l', 'o'};
//        String str = new String(chars);
//        System.out.println(str);


//        String color = "red";
//        color = "green";
//        System.out.println(color);

//        String some = "green";
//        System.out.println(color == some);
//
//        String test = new String("green");
//        System.out.println(color == test);


//        System.out.println(color.equals(some));
//        System.out.println(some.equals(test));
//        System.out.println(color.equals(test));






        // String-ის მეთოდები
        String first = "Davit";
        String last = "Maisuradze";
        System.out.println(first.length());
        System.out.println(last.charAt(6));
        System.out.println(first.compareTo(last));
        System.out.println(first.compareToIgnoreCase(last));
        System.out.println(first.equals(last));
        System.out.println("davit".equalsIgnoreCase("DAVIT"));
        System.out.println(last.replace("a", "x"));
        System.out.println(first.toUpperCase());
        System.out.println(first.toLowerCase());

        String[] arr = last.split("a");
        System.out.println(Arrays.toString(arr));

        String badString = "      Davit     ";
        System.out.println(badString);
        System.out.println(badString.trim());


        System.out.println(last.replace("Mai", "g"));
        System.out.println(last.replace("asldkfj", "x"));
    }
}