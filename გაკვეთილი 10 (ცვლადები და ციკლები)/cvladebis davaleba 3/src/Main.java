public class Main {
    public static void main(String[] args) {
        // სავარჯიშო 1
//        int a = 10, b = 15, c = 16;
//        double avg = (a + b + c) / 3.0;
//        System.out.println(avg);

        // სავარჯიშო 2
//        int number = 8;
//        System.out.println((number % 2 == 0) ? "ლუწია" : "კენტია");

        // სავარჯიშო 3
//        int a = 19, b = 17;
//        int max = (a > b) ? a : b;
//        System.out.println("უდიდესი რიცხვია " + max);

        // სავარჯიშო 4
//        int number = 9999;
//        int sum = number % 10 + (number / 10) % 10 + (number / 100) % 10 + (number / 1000) % 10;
//        System.out.println(sum);

        // სავარჯიშო 5
        int angle1 = 90, angle2 = 30, angle3 = 60;
        boolean isTriangle = (angle1 + angle2 + angle3 == 180);
        System.out.println(isTriangle ? "შესაძლებელია სამკუთხედის დახაზვა" : "ასეთი სამკუთხედი არ არსებობს");
    }
}