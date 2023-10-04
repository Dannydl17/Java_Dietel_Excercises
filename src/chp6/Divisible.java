package chp6;

public class Divisible {

    public static boolean isDivisible(int number) {
        for (int count = 1; count <=10; count++) {
            number+= number;
        }
        if (number % 5 == 0) {
            return true;
        }
        else {
            return  false;
        }
    }
}


