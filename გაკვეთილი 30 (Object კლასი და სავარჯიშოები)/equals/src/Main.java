public class Main {
    public static void main(String[] args) {
//        Object

//        if (5 == 5) {
//            System.out.println("Hello World");
//        }

        Human human = new Human("Davit", 20);
        // ახალი ობიექტი
        Human human2 = human;
        // ძველ ობიექტს ინახავს
//        if (human == human2) {
//            System.out.println("Human equal"); // ki
//        }

        Human exactHuman = new Human("Davit", 20);
        // ახალი ობიექტი
//        if (human == exactHuman) {
//            System.out.println("human and exactHuman equal"); // ara
//        }
//
//
//        if (human.equals(human2)) {
//            System.out.println("Human .equals()"); // ki
//        }
//
//        if (human.equals(exactHuman)) {
//            System.out.println("human and exactHuman .equals()"); // ki
//        }

//        if (human.equals(human)) {
//            System.out.println("human is equal to human");
//        }
//
//        if (human.equals(exactHuman)) {
//            System.out.println("human is equal to exact human");
//        }
//        if (exactHuman.equals(human)) {
//            System.out.println("exactHuman is equal to human");
//        }

        // თუ a=b და b=c მაშინ a=c
        if (human.equals(human2) && human2.equals(exactHuman)) {
            System.out.println("transitivity check");
        }
        if (human.equals(exactHuman)) {
            System.out.println("exactHuman is equal to human");
        }
    }
}