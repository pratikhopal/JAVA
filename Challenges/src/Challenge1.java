public class Challenge1 {
    public static void main(String[] args) {
        double value1 = 20.00;
        double value2 = 80.00;
        double value3= value1 + value2 *100.00;
        double remainder = value3 % 40.00;
        boolean question = (remainder ==0 ) ? true : false;
        if (remainder == 0.00){
            question=true;
        }else {question = false;
        }
    }
}
