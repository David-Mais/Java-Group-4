public class Main {
    public static void main(String[] args) {
        // getClass()
//        Human human = new Human("Davit", 20);
//        System.out.println(human.getClass().getName());

//        A a1 = new B();
//        A a2 = new C();
//        System.out.println(a1.getClass().getName());
//        System.out.println(a2.getClass().getName());


        // toString()
//        Human human = new Human("Davit", 20);
//        System.out.println(human.toString());
//        System.out.println(human);

        // clone()
        // shallow copy
//        Human human = new Human("Davit", 20);
//        Human human2 = human;
//        Human human3 = human;
//        Human human4 = human;
//        System.out.println(human);
//        System.out.println(human2);
//        human2.setAge(25);
//        System.out.println(human);
//        System.out.println(human2);
//        System.out.println(human3);
//        System.out.println(human4);

        // deep copy
//        Human human = new Human("Davit", 20);
//        Human newHuman = new Human(
//                human.getName(),
//                human.getAge()
//        );
//        System.out.println(human);
//        System.out.println(newHuman);
//        newHuman.setAge(45);
//        System.out.println(human);
//        System.out.println(newHuman);

        // clone
//        Human human = new Human("Davit", 20);
//        Human anotherHuman = human.clone();
//        System.out.println(human);
//        System.out.println(anotherHuman);
//        anotherHuman.setAge(66);
//        System.out.println(human);
//        System.out.println(anotherHuman);

        // hashCode()
        Human human = new Human("Davit", 20);
//        System.out.println(human.getClass().getName() + "@" + Integer.toHexString(human.hashCode()));
        Human human2 = new Human("Davit", 20);
        System.out.println(human.hashCode());
        System.out.println(human2.hashCode());
    }
}