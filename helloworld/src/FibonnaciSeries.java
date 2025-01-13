//The Fibonacci series is a sequence of numbers where
// each number is the sum of the two preceding ones,
// often starting with 0 and 1.
// Here's the beginning of the series:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
import java.util.Scanner;
public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number to get the Fibonacci Series \n");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);
        int sum=0;
        int count=0;
        for(int i=0;i<number;i++){
            System.out.print(count);
            System.out.print(",");
            count++;
            sum = sum+count;
            if (sum == number)
                break;
        }
        System.out.println(sum);
    }
}
