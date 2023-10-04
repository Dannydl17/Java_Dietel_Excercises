package AssigmentNdClassWork;

public class SummingDigits {
    public static void main(String[] args) {
     sumDigit(234);
    }
    public static int sumDigit(int numberEntered){
        int numbers = 0;
        while (numberEntered > 0) {
            int remainder = numberEntered % 10;
            numbers += remainder;
            numberEntered/=10;
        }
        return numbers;
    }
}
