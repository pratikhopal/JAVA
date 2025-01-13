import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        // Sanitize the string here
        string = string.replace(" ", "").toLowerCase();
        String reverse = ReverseString(string);
        CheckPalindrome(string, reverse);
    }

    public static void CheckPalindrome(String string, String reverse) {
        if (string.equals(reverse)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static String ReverseString(String string2) {
        String string3 = string2.replace(" ", ""); // Already sanitized in main
        char ch;
        String string4 = "";
        for (int i = 0; i < string3.length(); i++) {
            ch = string3.charAt(i);
            string4 = ch + string4;
        }
        return string4;
    }
}
