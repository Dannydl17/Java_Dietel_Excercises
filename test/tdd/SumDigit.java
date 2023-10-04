package tdd;

public class SumDigit {

    public static int canSeperatedNumbers(int numberEntered) {
        int numbers = 0;

        while (numberEntered != 0){
            if (numberEntered < 0){
                return numberEntered;
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
