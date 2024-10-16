public class Main {
    static int someNumber;

    public static void main(String[] args) {
        double pi = 3.74;
        int number = (int) pi;

        System.out.println(pi);
        System.out.println(number);

        char someChar = 'A';
        char otherChar = 100;
        System.out.println(someChar);
        System.out.println(otherChar);

        // სხვადასხვა ხაზზე გამოვაცხადოთ
        // და მივანიჭოთ მნიშვვნელობა
        int x;
        x = 15;
        int y = 18;
        int sum = x + y;

        System.out.println(x);
        System.out.println(someNumber);



        int a = 15;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        b = 6;
        System.out.println("a / b = " + (a / b));
        System.out.println(15 / 6);
        System.out.println("a % b = " + (a % b));

        System.out.println("b = " + b);
        b++;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(++b);

        System.out.println(a--);
        System.out.println(a);
        System.out.println(--a);

        int result = ++b;
        System.out.println(result);

        b = b + 5;
        b += 5;
        System.out.println(b);
        b -= 12;
        System.out.println(b);
        b *= 3;
        System.out.println(b);
        b /= 12;
        System.out.println(b);

        b = 34;
        b %= 15;
        System.out.println(b);

        b = 13;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a == b? " + (a == b));
        System.out.println("a != b? " + (a != b));

        System.out.println("a > b? " + (a > b));
        System.out.println("a < b? " + (a < b));
        System.out.println("a >= b? " + (a >= b));
        System.out.println("a <= b? " + (a <= b));




        boolean t = true;
        boolean f = false;
        //asdfasdfsadf
        /*
        asdf
        asdf
        asdfa
        asdf
        asdf
         */
        System.out.println(t | f);
        System.out.println(t & f);
        System.out.println(t || f);
        System.out.println(t && f);
        System.out.println(!t);

        System.out.println((true || false) && false);
        System.out.println(true || false && false);
        System.out.println(!true);


        if (true) {
            System.out.println("If block success");
        } else {
            System.out.println("If block fail");
        }


//        int age = 20;
//        boolean checkAge = age >= 18;
//        if (checkAge) {
//            System.out.println("Here you go. :)");
//        } else {
//            System.out.println("Get out!!! :(");
//        }

        int age = 20;
        if (age >= 18) {
            System.out.println("Here you go. :)");
        } else {
            System.out.println("Get out!!! :(");
        }
    }
}