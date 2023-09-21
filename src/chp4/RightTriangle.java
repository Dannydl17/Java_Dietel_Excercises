package chp4;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOfStar = keyboardInput.nextInt();

        for (int row = 1; row <= numberOfStar; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
