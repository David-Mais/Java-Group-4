import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1
//        ArrayList<Integer> list = new ArrayList<>(
//                List.of(99, -3, 27, 2, 11, -130, -67, 55)
//        );
//        System.out.println(list);
//        Collections.sort(list);
//
//        System.out.println(list);

        // 2
//        ArrayList<String> list = new ArrayList<>(
//                List.of("Hello", "Anna", "David", "Zoo")
//        );
//        Collections.sort(list);
//        System.out.println(list);

        // 3
        ArrayList<Car> cars = new ArrayList<>();
        Random rand = new Random();
        String[] brands = {
                "Toyota",
                "Honda",
                "Ford",
                "Mercedes",
                "Nissan",
                "BMW"
        };
        for (int i = 0; i < 100; i++) {
            String name = brands[rand.nextInt(brands.length)];
            int id = rand.nextInt(1000);
            cars.add(new Car(name, id));
        }

//        cars.forEach(System.out::println);
//        System.out.println("____________________________");
//        Collections.sort(cars);
//
//        cars.forEach(System.out::println);


//        Collections.sort(cars, new CarIdComparator());
//        cars.forEach(System.out::println);


        // 4
        Collections.sort(cars,  new CarComparator());
        cars.forEach(System.out::println);
    }
}