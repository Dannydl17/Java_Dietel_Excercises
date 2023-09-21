package AssigmentNdClassWork;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the number of stones: ");
        double numberOfStone = keyboardInput.nextDouble();

        System.out.print("Enter average weight of each stone: ");
        double averageOfStone = keyboardInput.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = keyboardInput.nextInt();

        double weightOfPyramid;

        weightOfPyramid = (numberOfStone * averageOfStone) / numberOfYears * 365;

        double eachHour = weightOfPyramid * 24;

        double numberOfHour = eachHour * 60;

        System.out.printf("WeightOfPyramid is %f%n EachHour is %f%n%n NumberOfHour is %f%n", weightOfPyramid, eachHour, numberOfHour);
    }
}
