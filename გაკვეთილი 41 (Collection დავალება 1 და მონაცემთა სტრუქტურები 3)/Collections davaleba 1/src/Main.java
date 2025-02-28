import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
//        savarjisho1();

//        ArrayList<Integer> list = new ArrayList<>();
//        do {
//            list.add(random.nextInt(51));
//        } while (!list.contains(40));
//        savarjisho2(list);


//        savarjisho3();

        Library library = new Library();
        library.populateList("books.txt");
        library.printBooks();
    }

    static void savarjisho1() {
        ArrayList<Integer> list = new ArrayList<>();

        do {
            list.add(random.nextInt(51));
        } while (!list.contains(40));
        System.out.println("სიის ზომმაა: " + list.size());

        printList(list);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int x : list) {
            if (x % 2 == 0) {
                evenNumbers.add(x);
            }
        }
        list.removeAll(evenNumbers);

        printList(list);
    }

    static void savarjisho2(List<Integer> list) {
        System.out.print("List of {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    static void savarjisho3() {
        int[] array = new int[5];
        System.out.print("Array ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        ArrayList<Integer> list = new ArrayList<>();
        for (int x : array) {
            list.add(x);
        }
        System.out.println(list);


        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }
        System.out.println("მაქსიმალური ინდექსია: " + maxIndex);
    }

    static void printList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.getLast());
        System.out.println("]");
    }
}