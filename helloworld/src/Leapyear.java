import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a leap year");
        int number=scanner.nextInt();
        if ((number % 4 ==0 && number % 100 != 0) || (number % 400==0)){
            System.out.println("Is A leap year");
        }else {
            System.out.println("Is not a leap year");
        }
    }
}

