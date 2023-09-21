package AssigmentNdClassWork;

import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = keyboardInput.nextInt();
        long total = 0;
        for (int counter=1; counter <= number; counter++) {
            total += counter;
            System.out.printf("%d             %d%n",  counter, total);
        }
    }
}
