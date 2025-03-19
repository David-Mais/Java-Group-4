import java.util.LinkedList;

public class Savarjisho2 {
    public static void main(String[] args) {
        // b a c
        LinkedList<String> words = new LinkedList<>();
        words.add("middle");
        System.out.println(words);

        words.addFirst("start");
        System.out.println(words);

        words.addLast("end");
        System.out.println(words);
    }
}
