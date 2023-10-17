package chp6;

public class SumOfDigits {
    public static int seperatedNumbers(int numberEntered) {
        int numbers = 0;

        while (numberEntered != 0){
            if (numberEntered < 0){
                break;
            }
            else {
                int remainder = numberEntered % 10;
                numbers += remainder;
                numberEntered /= 10;
            }
        }
        return numbers;
    }

}
