//Write a class with methods to perform addition, subtraction, multiplication, and division of two numbers.
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number you what to be operated on \n");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Addition of the numbers is "+ add(num1,num2));
        System.out.println("Substraction of the numbers is "+ subs(num1,num2));
        System.out.println("Multiply of the numbers is "+ multiply(num1,num2));
        System.out.println("Division of the numbers is "+ div(num1,num2));
    }


    public static int add(int a ,int b){
        return a+b;
    }
    public static int subs(int a ,int b){
        return a-b;
    }
    public static int multiply(int a ,int b){
        return a*b;
    }
    public static int div(int a ,int b){
        return a/b;
    }



}
