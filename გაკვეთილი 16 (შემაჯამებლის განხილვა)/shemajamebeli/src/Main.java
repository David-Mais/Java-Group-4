import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. b
//        int[] arr = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i : arr) {
//            if (i % 2 == 0) sum += i;
//            else sum -= i;
//        }
//        System.out.println(sum);

        //2. c
//        int[] arr = new int[2][2];
//        int[][] arr = new int[5][];
//        System.out.println(Arrays.deepToString(arr));

        //3. d
//        int[] arr = {0,1,2,3,4};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[(arr[i] + 3) % arr.length];
//        }
//        System.out.println(arr[1]);

        //4. c

        //5. a

        //6. c

        //7. a

        //8. a

        //9. a
//        int[] arr = new int[10];
//        System.out.println(Arrays.toString(arr));

        //10. c

        //11. c
//        int[] arr = {1,2,3,4,5};

        //12. c

        //13. a

        //14. a

        //15. b

        //16
//        int[] prices = {1,5,9,2,10,7};
//        int minPrice = prices[0];
//        int maxPrice = prices[0];
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//                minIndex = i;
//            }
//            if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                maxIndex = i;
//            }
//        }
//
//        System.out.println("ყველაზე იაფია მაღაზიაში სახელად: " +
//                minIndex + " და ღირს: " + minPrice + " ლარი");
//        System.out.println("ყველაზე ძვირია მაღაზიაში სახელად: " +
//                maxIndex + " და ღირს: " + maxPrice + " ლარი");

        //17
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 7 == 0) {
//                System.out.println("HEYHOW");
//            }else if(i % 7 == 0) {
//                System.out.println("HOW");
//            }else if (i % 5 == 0) {
//                System.out.println("HEY");
//            }else {
//                System.out.println(i);
//            }
//        }

        //18
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("გთხოვვთ შეიყვვანოთ რიგების" +
//                " რაოდენობა: ");
//        int rows = scanner.nextInt();
//        System.out.print("გთხოვვთ შეიყვვანოთ სვეტების" +
//                " რაოდენობა: ");
//        int cols = scanner.nextInt();
//        System.out.println();
//        int[][] array = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                array[i][j] = random.nextInt(100);
//            }
//        }
//
//        System.out.println("დაგენერირებული 2 განზომილებიანი" +
//                " მასივია:");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int min = array[0][0];
//        int max = array[0][0];
//        int minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                if (array[i][j] < min) {
//                    min = array[i][j];
//                    minRow = i;
//                    minCol = j;
//                }
//                if (array[i][j] > max) {
//                    max = array[i][j];
//                    maxRow = i;
//                    maxCol = j;
//                }
//            }
//        }
//        System.out.println("მინიმალური ელემენტია: " + min + " ინდექსზე" +
//                " (" +minRow + "," + minCol + ")");
//        System.out.println("მაქსიმალური ელემენტია: " + max + " ინდექსზე" +
//                " (" + maxRow + "," + maxCol + ")");

        //19
//        int[][] arr1 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int[][] arr1 = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
//
//        int n = arr1.length;
//
//
//        int diagonalSum = 0;
//
//        for (int i = 0; i < n; i++) {
//            diagonalSum += arr1[i][i];
//            diagonalSum += arr1[i][n - 1 - i];
//        }
//
//        if (n % 2 == 1) {
//            diagonalSum -= arr1[n / 2][n / 2];
//        }
//
//        System.out.println(diagonalSum);

        //20
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = arr.length;

        for(int[] i : arr) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] i : arr) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - j - 1];
                arr[i][n - j - 1] = temp;
            }
        }
        for(int[] i : arr) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}