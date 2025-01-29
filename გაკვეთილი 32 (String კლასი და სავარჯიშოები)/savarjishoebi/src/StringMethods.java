import java.util.Scanner;

public class StringMethods {
    public int calculateStringLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any text: ");
        String text = scanner.nextLine();

        int textLength = text.length();
        System.out.println("Length of the string is: " + textLength);
        return textLength;
    }

    public String turnStringUppercase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any text: ");
        String text = scanner.nextLine();

        String result = text.toUpperCase();
        System.out.println("Result: " + result);
        return result;
    }

    public String reverseAndUppercaseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        String result = sb
                .reverse()
                .toString()
                .toUpperCase();
        System.out.println("Result: " + result);
        return result;
    }

    public boolean firstContainsSecond(String first, String second) {
        return first.contains(second);
    }

    public int countVowels(String text) {
        text = text.toLowerCase();
        int count = 0;
        for (char c : text.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        return count;
    }

    public boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        return input.equals(reversed);
    }

    // მე ვარ დათა -> ემ რავ ათად
    public String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord);

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
