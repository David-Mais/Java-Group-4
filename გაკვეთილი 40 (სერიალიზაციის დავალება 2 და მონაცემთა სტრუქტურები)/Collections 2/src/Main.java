import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // 1
//        HashSet<String> names = new HashSet<>();
//        names.add("Giorgi");
//        names.add("Mariami");
//        names.add("Vato");
//        names.add("Nikolozi");
//        names.add("Giorgi");
//        System.out.println(names);
//        System.out.println(names.size());
//        System.out.println(names.isEmpty());
//        names.clear();
//        System.out.println(names.isEmpty());
//        System.out.println("Set contains Giorgi: " + names.contains("Giorgi"));
//        System.out.println("Set contains Davit: " + names.contains("Davit"));
//
//        names.remove("Vato");
//        System.out.println(names);




        // 2
//        ArrayList<Integer> list = new ArrayList<>(
//                List.of(1,1,1,1,1,1,2,2,2,4,44,4,44,4,4,4,99,99,100)
//        );
//        System.out.println(list);
//
//        HashSet<Integer> set = new HashSet<>();
        // 2.1
//        for (int i : list) {
//            set.add(i);
//        }
//        System.out.println(set);

        // 2.2
//        set.addAll(list);
//        System.out.println(set);

        // 2.3
//        Set<Integer> uniqueNumbers = new HashSet<>(list);
//        System.out.println(uniqueNumbers);



        // 3
//        Animal a1 = new Animal("Dog", 3);
//        Animal a2 = new Animal("Cat", 4);
//        Animal a3 = new Animal("Cow", 2);
//
//        HashSet<Animal> animals = new HashSet<>();
//        animals.add(a1);
//        animals.add(a1);
//        animals.add(a1);
//        animals.add(a2);
//        animals.add(a3);
//        System.out.println(animals);
//
//        Animal a4 = new Animal("Dog", 3);
//        System.out.println(a1.equals(a4));
//        animals.add(a4);
//        System.out.println(animals);


        // 4
//        TreeSet<String> words = new TreeSet<>();
//        words.add("d");
//        words.add("a");
//        words.add("b");
//        words.add("c");
//        System.out.println(words);
//
//        TreeSet<Integer> intset = new TreeSet<>();
//        intset.add(1);
//        intset.add(-2);
//        intset.add(99);
//        intset.add(-3);
//        System.out.println(intset);

        // 5
        TreeSet<Animal> animals = new TreeSet<>();
        animals.add(new Animal("Dog", 3));
        animals.add(new Animal("Cat", 5));
        animals.add(new Animal("Cow", 2));
        animals.add(new Animal("Cow", 5));
        System.out.println(animals);
    }
}