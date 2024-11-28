public class Methods {
    int add(int a, int b) {
        System.out.println(a);
        System.out.println(b);

        return a + b;
    }

    double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    void printNNumbers(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        printNNumbers(n - 1);
    }

    int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}