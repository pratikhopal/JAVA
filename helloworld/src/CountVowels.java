//Write a program to count the number of vowels and consonants in a given string.
//The program should prompt the user to enter a string.
//It should then count and display the number of vowels (a, e, i, o, u) and consonants in the string.
//The program should ignore spaces and special characters.
import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        string=string.toLowerCase();
        char place;
        int countvowels=0 , consonants =0;
        for (int i =0 ;i<string.length();i++){
            place = string.charAt(i);
            if (Character.isLetter(place)){
                if (place == 'a' || place == 'i' || place =='e' || place =='o' || place =='u'){
                    countvowels = countvowels + 1;
                } else {
                    consonants  = consonants  + 1;
                }
            }
        }
        System.out.println("Number of vowels in string are " + countvowels);
        System.out.println("Number of consonants  in string are " + consonants);
    }
}
