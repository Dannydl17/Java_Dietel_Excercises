package chp6;

public class PerfectNumber {

    public static int isPerfectNumber(int number) {
     int total = 0;
       int counter = 0;
        for (int count = 1; count<=number; count++) {
            if (number <=1000){
                if (number % count == 0) {
                    total+=counter;
                    counter++;
                }
            }

        }
        return total;
        }
    }
