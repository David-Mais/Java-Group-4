import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) throws NumberLessThanZeroException, InvalidOperationException {
        UtilMethods utilMethods = new UtilMethods();
//        System.out.println(utilMethods.divide());

//        System.out.println(utilMethods.factorial());
//        try {
//            System.out.println(utilMethods.factorial());
//        } catch (NumberLessThanZeroException e) {
//            System.out.println(e.getMessage());
//        }

//        System.out.println(utilMethods.calculate(12.3, 4.4, '+'));
//        System.out.println(utilMethods.calculate(12.3, 4.4, '-'));
//        System.out.println(utilMethods.calculate(12.3, 4.4, '*'));
//        System.out.println(utilMethods.calculate(12.3, 4.4, '/'));
//        System.out.println(utilMethods.calculate(12.3, 0, '/'));
//        System.out.println(utilMethods.calculate(12.3, 4.4, 'g'));

        try {
            System.out.println(utilMethods.calculate(12.3, 4.4, 'g'));
        } catch (InvalidOperationException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}