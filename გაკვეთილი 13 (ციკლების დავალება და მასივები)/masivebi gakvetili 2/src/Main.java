import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1
        // შექმენით 5 რიცხვიანი მასივი და დაბეჭდეთ
//        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 2
        // დაბეჭდეთ 4 ელემენტიანი რიცხვების მასივის ჯამი
//        int[] arr = {10,20,30,40};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

        // 3
        // დაბეჭდეთ რიცხვების მასივიდან მაქსიმალური ელემენტი
//        int[] arr = {12, 4, 19, 7, 23};
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("Max: " + max);

        // 4
        // დაბეჭდეთ მასივი უკუღმა
        // {1,2,3,9,12} -> 12, 9, 3, 2, 1
//        int[] arr = {1,2,3,4,5};
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }

        // 5
        // რამდენი კენტი და რამდენი ლუწია მასივში
//        int[] arr = {1,1,1,1,1};
//        int odd = 0;
//        int even = 0;
//        for (int number : arr) {
//            if (number % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//        }
//        System.out.println("Odd: " + odd);
//        System.out.println("Even: " + even);

        // 6
        // შეაერთეთ ორი მასივი ერთ დიდ მასივში
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {4,5,6,7,8};
//        int[] merged = new int[arr1.length + arr2.length];
//        for (int i = 0; i < arr1.length; i++) {
//            merged[i] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            merged[arr1.length + i] = arr2[i];
//        }
//
//        System.out.println("Merged array: " + Arrays.toString(merged));

        // 7
        // გაქვთ მასივი და რიცხვი. თუ რიცხვი მასივშია დაბეჭეთ ინდექსი
        // თუ რიცხვი არ გვაქვს მასივში დაბეჭდეთ რომ არ გვაქვს
//        int[] arr = {1,2,3,4,5};
//        int search = 9;
//        boolean found = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == search) {
//                System.out.println("Found at index: " + i);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Not found!");
//        }


        // 8
        // 3x3 მასივში დაადგინეთ დიაგონალის ნამრავლი
//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int product = 1;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j) {
//                    product *= matrix[i][j];
//                }
//            }
//        }
//        System.out.println(product);

        // 9
        // 7x7 მასივი შეავსეთ შემთხვევითი (Random) რიცხვებით [0, 30]
        // დაითვალეთ და დაბეჭდეთ კენტების და ლუწების რაოდენობა
        // ასევე დაბეჭდეთ რომელია მეტი კენტი თუ ლუწი?
//        Random random = new Random();
//        int[][] matrix = new int[7][7];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(31);
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int odd = 0;
//        int even = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] % 2 == 0) {
//                    even++;
//                } else {
//                    odd++;
//                }
//            }
//        }
//        System.out.println("Odd: " + odd);
//        System.out.println("Even: " + even);
//        if (odd > even) {
//            System.out.println("Odd is more");
//        } else if (even > odd) {
//            System.out.println("Even is more");
//        } else {
//            System.out.println("Odd and even are equal");
//        }


        // 10
        // დაითვალეთ 5x5 მასივის ელემენტების ჯამი და ნამრავლი
//        int[][] twoDArray = new int[5][5];
//        Random random = new Random();
//        for (int i = 0; i < twoDArray.length; i++) {
//            for (int j = 0; j < twoDArray[i].length; j++) {
//                twoDArray[i][j] = random.nextInt(11);
//            }
//        }
//        for (int i = 0; i < twoDArray.length; i++) {
//            for (int j = 0; j < twoDArray[i].length; j++) {
//                System.out.print(twoDArray[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int sum = 0;
//        int product = 1;
//        for (int i = 0; i < twoDArray.length; i++) {
//            for (int j = 0; j < twoDArray[i].length; j++) {
//                sum += twoDArray[i][j];
//                product *= twoDArray[i][j];
//            }
//        }
//        System.out.println("Sum: " + sum);
//        System.out.println("Product: " + product);
    }
}