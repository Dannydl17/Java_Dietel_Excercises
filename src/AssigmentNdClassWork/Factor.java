package AssigmentNdClassWork;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboardInput.nextInt();

        int counter = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count ==0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
