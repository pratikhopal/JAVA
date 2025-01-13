//Sum of Digits
//Write a program to find the sum of digits of a given number.
// For example, for the number 1234, the sum of digits is 1 + 2 + 3 + 4 = 10.
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum=0;
        while (number != 0){
            sum =sum + number % 10;
            number=number/=10;
        }
        System.out.println(sum);
    }
}
