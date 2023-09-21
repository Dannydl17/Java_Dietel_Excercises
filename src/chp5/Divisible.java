package chp5;

public class Divisible {
    public String calculateDivisibleNumber(int number) {

        for (; number < 30; number++) {
            if (number % 3 == 0) {
                System.out.printf("%d ", number);
            }
        }
        return String.valueOf(number);
    }
}


