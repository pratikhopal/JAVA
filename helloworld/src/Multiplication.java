//Write a program to generate the multiplication table of a given number up to 10.
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for table");
        int num = scanner.nextInt();
        String ch1="*";
        String ch2="=";
        for (int i=1 ; i<=10 ;i++) {
            System.out.println(num + ch1 + i + ch2 + num*i);
        }
    }
}
