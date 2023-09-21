package AssigmentNdClassWork;

import java.util.Scanner;

public class Physics {
    public static void main(String[] args) {
        Scanner  keyboardInput = new Scanner(System.in);
        System.out.print("Enter the starting velocity: ");
        double startingVelocity = keyboardInput.nextDouble();

        System.out.print("Enter the ending velocity: ");
        double endingVelocity1 = keyboardInput.nextDouble();

        System.out.print("Enter the time: ");
        double time = keyboardInput.nextDouble();

        double averageAcceleration = (endingVelocity1 - startingVelocity) / time;
        System.out.printf("The average acceleration is %.4f", averageAcceleration);
    }
}
