package AssigmentNdClassWork;

import java.util.Scanner;

public class Practices2 {
    public static void main(String[] args) {
//        for (int num = 1; num <=5 ; num+=3) {
//            System.out.println(num);
//        }

        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboardInput.nextInt();

        for (int numbers = 1; numbers <= number; numbers++) {
            System.out.print(numbers + " ");
        }
    }
}
