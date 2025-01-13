
//Write a program to calculate the factorial of a given number using a for-loop.
//Hint: The factorial of a number n (denoted as n!) is the product
// of all positive integers less than or equal to n.
// For example, the factorial of 5 (5!) is 5 * 4 * 3 * 2 * 1 = 120.
//Think it through and give it a shot! If you need any hints or help, I’m right here.

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number to find a factorial for\n");
        int number = scanner.nextInt();
        int sum=1;
        for (int i=1;i <=number;i++){
            sum=sum * i;
        }
        System.out.println(sum);
    }
}
