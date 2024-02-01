package practices;

import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int number =  3 * randomNumbers.nextInt(5);


        System.out.println(number);
//        for (int counter = 1; counter <=20; counter++) {
//            int face = 1 + randomNumber.nextInt(6);
//            System.out.printf("%d  ", face);
//            if (counter % 5 ==0) {
//                System.out.println();
//            }
//        }
    }
}
