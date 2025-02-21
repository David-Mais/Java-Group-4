import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // 1
//        List<String> list = new ArrayList<>();
//        list.add("Davit");
//        list.add(null);
//        list.add("Davit");
//        System.out.println(list);

        // 2
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add("asdfasdf"); პრობლემაა!!!!!
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(11);
//        System.out.println(list);
//        System.out.println("Size of the list is: " + list.size());
////        list.clear();
////        System.out.println(list);
//        System.out.println("Is list empty?: " + list.isEmpty());
//        System.out.println("7th element is: " + list.get(7));
//        list.set(0, 99);
//        System.out.println(list);
//        list.set(111, 9999);
//        System.out.println(list);  IndexOutOfBoundsException
//
//        list.add(2, 75);
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        ArrayList<Integer> list2 = new ArrayList<>(1_000_000_000);


        // 3
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Davit");
//        names.add("Andria");
//        names.add("Avto");
//        names.add("Giorgi");
//        names.add("Irakli");
//        System.out.println(names);
//
//        names.remove(1);
//        System.out.println(names);
//
//        names.remove("Girogi");
//        System.out.println(names);
//
//        System.out.println(names.contains("Giorgi"));
//        System.out.println(names.contains("Irakli"));
//        System.out.println(names.contains("John"));
//
//        System.out.println("Index of Avto is: " + names.indexOf("Avto"));
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        ArrayList<String> namesToRemove = new ArrayList<>();
//        for (String name : names) {
//            namesToRemove.add(name);
//        }
//
//        names.removeAll(namesToRemove);
//        System.out.println(names);
//
//        for (String name : names) {
//            names.remove(name); Exception!!!
//        }


        // 4
//        Vector<String> names = new Vector<>();
//        names.add("John");
//        names.add("Jane");
//        names.add("Bob");
//        names.size();

//        List<String> list = new Vector<>();

        // 5
        LinkedList<String> list = new LinkedList<>();
        list.add("Bob");
        list.contains("asdf");
        list.size();
    }
}