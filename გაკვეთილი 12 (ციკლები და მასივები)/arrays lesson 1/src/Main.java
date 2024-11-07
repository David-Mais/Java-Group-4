public class Main {
    public static void main(String[] args) {
        // მასივის შექმნის ვარიანტები
        int[] nums = new int[9];
        String[] names = {"Avto", "Gio", "Giorgi", "Irakli", "Mariami"};

        // მნიშვნელობის მინიჭება
        nums[0] = 14;
//        for (int x : nums) {
//            System.out.println(x);
//        }

        // წავიკითხოთ მასივი
//        System.out.println(names);
//        System.out.println(names[1]);
//        System.out.println(names[0]);
//        System.out.println(names[5]); // ერორია და შემდეგ ხაზებს აღარ კითხულობს
//        System.out.println("Hello");

//        for (int i = 0; i < 5; i++) {
//            System.out.println(names[i]);
//        }

//        System.out.println("Names მასივის ზომაა: " + names.length);
//        System.out.println("Nums მასივის ზომაა: " + nums.length);
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        // for-each ციკლი
//        for (String x : names) {
//            System.out.println(x);
//        }

        // ორგანზომილებიანი მასივები
        // [
        //  [1,2,3],
        //  [4,5,6],
        //  [7,8,9]
        // ]

        int[][] twoDArray = new int[3][4];
        int[][] numbers = {
                {1,2,3},
                {4,5,6,99, 21},
                {7}
        };

        int[][] arr = new int[6][5];
//        System.out.println(numbers);
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1][2]); // დაბეჭდავს 6

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i].length);
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println(numbers[i][j]);
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
    }
}