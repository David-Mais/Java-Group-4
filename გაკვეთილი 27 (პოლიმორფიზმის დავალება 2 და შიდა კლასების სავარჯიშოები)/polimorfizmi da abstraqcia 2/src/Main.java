import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ლისტის შექმნა
        List<String> myList = new ArrayList<>();

        // ელემენტების დამატება
        myList.add("ვვაშლი");
        myList.add("ბანანი");
        myList.add("ალუბალი");

        // ელემენტის ამოღება
        myList.remove("ბანანი");

        // ელემენტის მიღება ინდექსით
        String fruit = myList.get(0);
        System.out.println("First element: " + fruit);

        // ელემენტის ძიება ინდექსით
        int index = myList.indexOf("ალუბალი");
        System.out.println("Index of ალუბალი: " + index);

        // ლისტის ზომის გაგება
        int size = myList.size();
        System.out.println("List size: " + size);

        // ელემენტების დათვალიერება
        for (String item : myList) {
            System.out.println("Item: " + item);
        }
    }
}
