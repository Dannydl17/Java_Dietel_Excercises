package AssigmentNdClassWork;

import java.util.Scanner;

public class Practices10 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        for (int counter = 0; counter <=100; counter++) {
            System.out.print("Enter a score: ");
            int numberOfScore = keyboardInput.nextInt();

            if (numberOfScore >= 90 && numberOfScore <= 100) {
                System.out.println("A");
            }
            if (numberOfScore >= 80 && numberOfScore<=89) {
                System.out.println("B");
            }
            if (numberOfScore >= 70 && numberOfScore<=79) {
                System.out.println("C");
            }
            if (numberOfScore >= 60 && numberOfScore<=69) {
                System.out.println("D");
            }
            else {
                System.out.println("F");
            }
        }
    }
}
