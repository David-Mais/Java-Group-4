public class Main {
    public static void main(String[] args) {
        // დავალება 1

        // სავარჯიშო 1
//        double c = 12.45;
//        double f = c * (9.0 / 5.0) + 32;
//        System.out.println(f);

        // სავარჯიშო 2
//        double f = 89.4;
//        double c = (f - 32) / (9.0 / 5.0);
//        double celsius = (f - 32) * 5 / 9;
//        System.out.println(c);
//        System.out.println(celsius);

        // სავარჯიშო 3
//        int year = 2000;
//        if (year % 400 == 0) {
//            System.out.println("ნაკიანია");
//        } else if (year % 100 == 0) {
//            System.out.println("არაა ნაკიანი");
//        } else if (year % 4 == 0) {
//            System.out.println("ნაკიანია");
//        } else {
//            System.out.println("არაა ნაკიანი");
//        }
//
//        // ამოხსნის მეორე ვარიანტი
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println("ნაკიანია");
//        } else {
//            System.out.println("არაა ნაკიანი");
//        }


        // სავარჯიშო 4
//        int x = 0;
//        int y = 0;
//
//        if (x == 0 && y == 0) {
//            System.out.println("საკოორდინატო სათავეშია");
//        } else if (x == 0) {
//            System.out.println("Y ღერძზეა");
//        } else if (y == 0) {
//            System.out.println("X ღერძზეა");
//        } else if (x > 0 && y > 0) {
//            System.out.println("I");
//        } else if (x < 0 && y > 0) {
//            System.out.println("II");
//        } else if (x < 0 && y < 0) {
//            System.out.println("III");
//        } else if (x > 0 && y < 0) {
//            System.out.println("IV");
//        } else {
//            System.out.println("მსგავსი წერტილი არ არსებობს");
//        }

        // სავარჯიშო 5
//        String op = "+";
//        double a = 6.4;
//        double b = 3.2;
//        switch (op) {
//            case "+":
//                System.out.println(a + b);
//                break;
//            case "-":
//                System.out.println(a - b);
//                break;
//            case "*":
//                System.out.println(a * b);
//                break;
//            case "/":
//                System.out.println(a / b);
//                break;
//            default:
//                System.out.println("ეს ოპერაცია არასწორია");
//        }



        // დავალება 2

        // სავარჯიშო 1
//        int a = 5;
//        int b = 10;
//        int z;
//
//        z = a;
//        a = b;
//        b = z;
//
//        System.out.println("a: " + a + ", " + "b: " + b);
        // ვარიანტი 2
//        int a = 10;
//        int b = 20;
//
//        a += b;
//        b = a - b;
//        a -= b;
//        System.out.println("a: " + a + ", " + "b: " + b);

        // სავარჯიშო 2
//        float x = 10.234F;
//        int a = (int) x;
//        System.out.println(x - a);
//        System.out.println(x % 1);

        // სავარჯიშო 3
//        int x = 1213;
//        if (x >= 100 && x < 1000) {
//            System.out.println("ეს რიცხვი სამნიშნაა");
//        } else {
//            System.out.println("არაა სამნიშნა");
//        }

        // სავარჯიშო 4
//        char a = 'x';
//        char capitalA = (char) (a - 32);
//        System.out.println(capitalA);

        // სავარჯიშო 5
//        double a = 5.10;
//
//        int result = (int) (a + 0.5);
//        System.out.println(result);

        // სავარჯიშო 6
//        int a = 11;
//        int b = 3;
//        int k = 2;
//
//        int sideA = (a + k - 1) / k;
//        int sideB = (b + k - 1) / k;
//        System.out.println(sideA);
//        System.out.println(sideB);
//        System.out.println(sideA * sideB);

        // სავარჯიშო 7
//        int seconds = 7645;
//        int minutes = 0;
//        int hours = 0;
//
//        if (seconds >= 3600) {
//            hours = seconds / 3600;
//            seconds %= 3600;
//        }
//        if (seconds >= 60) {
//            minutes = seconds / 60;
//            seconds %= 60;
//        }
//        System.out.println(hours + ":" + minutes + ":" + seconds);

        // სავარჯიშო 8
        int totalSeconds = 61;
        //0
        int hours = totalSeconds / 3600;
        //61
        int remainingSecondsAfterHours = totalSeconds % 3600;
        //1
        int minutes = remainingSecondsAfterHours / 60;
        //1
        int seconds = remainingSecondsAfterHours % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}