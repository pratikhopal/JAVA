//Write a program that prints the numbers from 1 to 100.
//But for multiples of 3, print "Fizz" instead of the number and
//for the multiples of 5, print "Buzz". For numbers which
//are multiples of both 3 and 5, print "FizzBuzz".



public class Ifelse {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if (i%5==0){
                System.out.println("Buzz");
            } else
            {
            System.out.println(i);
            }
        }
    }
}
