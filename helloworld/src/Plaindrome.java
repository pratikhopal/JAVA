//Write a program to check if a given string is a palindrome.
// A palindrome is a word, phrase, number, or other sequences of
// characters that reads the same forward and backward
// (ignoring spaces, punctuation, and capitalization).
import java.util.Scanner;
public class Plaindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a string \n");
        String string= scanner.next();
        String rstr="";
        char ch;
        for (int i =0 ; i < string.length() ;i++){
            ch=string.charAt(i);
            rstr=ch+rstr;
        }
        if (string.equals(rstr)){
            System.out.println(string +" word is a Palindrome");
        } else {
            System.out.println(string +" word is not a Palindrome");
        }
    }
}
