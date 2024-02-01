package AssigmentNdClassWork;

import java.security.SecureRandom;
import java.util.Scanner;

import static java.lang.System.in;

public class Num {
    private static final Scanner scanner = new Scanner(in);
    public static void main(String[] args) {
//        int conter = 0;
//        while (true){
            int input = scanner.nextInt();
            switch (input){
                case 0 -> System.out.println("mee");
                case 1 -> System.out.println("hello");
                case 2 -> System.out.println("HI");
                default -> System.exit(0);
            }
            //        }

//        SecureRandom randomNumbers = new SecureRandom();
//        for (int counter = 1; counter <= 20;counter++) {
//            int face = 1 + randomNumbers.nextInt(6);
//            System.out.printf("%d    ",face);
//
//            if (counter % 5 == 0) {
//                System.out.println();
//            }
//        }
    }
}
