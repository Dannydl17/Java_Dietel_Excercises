package chp4;

import java.util.Scanner;

public class DistanceTwo {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter x1 coordinates: ");
        int firstCoordinates = keyboardInput.nextInt();

        System.out.print("Enter y1 coordinates: ");
        int secondCoordinates = keyboardInput.nextInt();

        System.out.print("Enter x2 coordinates: ");
        int thirdCoordinates = keyboardInput.nextInt();

        System.out.print("Enter y1 coordinates: ");
        int fourthCoordinates = keyboardInput.nextInt();


        double x1 = firstCoordinates;
        double y1 = secondCoordinates;
        double x2 = thirdCoordinates;
        double y2 = fourthCoordinates;
        double distance = 0;

        distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.printf("The distance is: %f", distance);
    }
}
