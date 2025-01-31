import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(countDigits("Data 2004 Maisuradze 20/09"));

//        System.out.println(countSentences("გამარჯობა. მე მქვია დათა! შენ რა გქვია?"));

//        System.out.println(isPalindrome("abcbA"));
//        System.out.println(isPalindrome("abab"));

//        System.out.println(isSubstring("Hello", "ell"));
//        System.out.println(isSubstring("Hello", "Ho"));

//        if (endsWithVowel()) {
//            System.out.println("Vowel");
//        } else {
//            System.out.println("Consonant");
//        }

//        System.out.println(reconstructOriginalString("abba"));
//        System.out.println(reconstructOriginalString("abbazzasdfgg"));

//        System.out.println(abbreviate("სალამი"));
//        System.out.println(abbreviate("ინტერნაციონალიზაცია"));
    }

    static int countDigits(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    static int countSentences(String text) {
        int count = 0;
        String sentenceEndings = ".?!;";
        for (char c : text.toCharArray()) {
            if (sentenceEndings.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    static boolean isPalindrome(String text) {
        String cleaned = text.replace("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

    static boolean endsWithVowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            return false;
        }

        char lastChar = text.toLowerCase().charAt(text.length() - 1);
        String vowels = "aeiou";
        return vowels.indexOf(lastChar) != -1;
    }

    static String reconstructOriginalString(String text) {
        StringBuilder original = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            original.append(text.charAt(i));
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1)) {
                i += 2;
            } else {
                i++;
            }
        }

        return original.toString();
    }

    static String abbreviate(String word) {
        if (word.length() > 10) {
            int middleCount = word.length() - 2;
            return word.charAt(0) + String.valueOf(middleCount) + word.charAt(word.length() - 1);
        } else {
            return word;
        }
    }
}