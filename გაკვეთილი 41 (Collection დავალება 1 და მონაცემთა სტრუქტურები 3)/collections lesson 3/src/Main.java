import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1
//        HashMap<String, String> shapes = new HashMap<>();
//        shapes.put("სამკუთხედი", "წითელი");
//        shapes.put("მართკუთხედი", "ყვითელი");
//        shapes.put("ტეხილი", "მწვანე");
//        shapes.put("კვადრატი", "წითელი");
//        System.out.println(shapes);


        // 2
//        HashMap<String, String> map = new HashMap<>();
//        map.put("0159", "დიდი დიღომი");
//        map.put("0163", "ვარკეთილი");
//        map.put("0137", "სამგორი");
//        map.put("0108", "რუსთაველი");
//        System.out.println(map);

//        map.clear();
//        System.out.println(map);

//        System.out.println("map contains key 0163: " + map.containsKey("0163"));
//        System.out.println("map contains key 9999: " + map.containsKey("9999"));

//        System.out.println("map contains value დიდი დიღომი: " + map.containsValue("დიდი დიღომი"));
//        System.out.println("map contains value საბურთალო: " + map.containsValue("საბურთალო"));

//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry);
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println();
//        }

//        System.out.println("is map empty: " + map.isEmpty());

//        System.out.println(map.keySet());
//        System.out.println(map.values());

//        System.out.println(map.get("0159"));
//        System.out.println(map.get("0163"));

//        System.out.println(map.size());




        // 3
//        HashMap<String, String> map = new HashMap<>();
//        map.put("0159", "დიდი დიღომი");
//        map.put("0163", "ვარკეთილი");
//        map.put("0137", "სამგორი");
//        map.put("0108", "რუსთაველი");
//        System.out.println(map);

//        map.put("0108", "რუსთაველი");
//        System.out.println(map);

//        map.put("0108", "საბურთალო");
//        System.out.println(map);
//
//        map.put("9999", "სამგორი");
//        System.out.println(map);

//        map.putIfAbsent("0108", "საბურთალო");
//        System.out.println(map);

//        System.out.println(map.get("9999"));



        // 4
//        int[] nums = {1,2,4,1,2,67,2,3,27,4,2,6,3,2,1};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int x : nums) {
//            if (map.containsKey(x)) {
//                map.put(x, map.get(x) + 1);
//            } else {
//                map.put(x, 1);
//            }
//        }
//        System.out.println(map);



        // 5
//        ArrayList<Integer> list = new ArrayList<>(
//                List.of(56, 109, -400, 23, -2, 11, 127)
//        );
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);


        // 6
//        ArrayList<String> words = new ArrayList<>(
//                List.of("word", "world", "hello", "!!!", "Apple")
//        );
//        System.out.println(words);
//        Collections.sort(words);
//        System.out.println(words);


        // 7
//        ArrayList<Car> cars = new ArrayList<>(
//                List.of(
//                        new Car(19, "aa"),
//                        new Car(1, "sdfg"),
//                        new Car(-3, "1234"),
//                        new Car(109, "qwer"),
//                        new Car(1111, "asda")
//                )
//        );
//        System.out.println(cars);
//        Collections.sort(cars);
//        System.out.println(cars);


        // 7
        List<Car> cars = new ArrayList<>();
        Random random = new Random();
        String[] sampleNames = {
                "Toyota",
                "Honda",
                "Ford",
                "Nissan",
                "Chevy",
                "Volkswagen",
                "BMW",
                "Mercedes-Benz",
                "Audi",
                "Hyundai"
        };
        for (int i = 0; i < 10; i++) {
            String name = sampleNames
                    [
                        random.nextInt(sampleNames.length)
                    ];
            int id = random.nextInt(1000);
            cars.add(new Car(id, name));
        }

        cars.forEach(System.out::println);
        System.out.println();

        Collections.sort(cars);
        cars.forEach(System.out::println);
    }
}