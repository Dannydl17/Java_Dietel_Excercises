package AssigmentNdClassWork;

import java.util.Scanner;

public class Practices3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest;
        int nextLargest;
        int number;
        int counter;
        System.out.print( "Enter number: " );
        largest = input.nextInt();

        System.out.print("Enter number: ");
        number = input.nextInt();

        if (number > largest) {
            nextLargest = largest;
            largest = number;
        } else
            nextLargest = number;

        counter = 2;
        while (counter < 10) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number > largest) {
                nextLargest = largest;
                largest = number;
            } else if (number > nextLargest) {
                nextLargest = number;
            }
            counter++;
        }
        System.out.printf("Largest is %d\nSecond largest is %d\n",
                largest, nextLargest);
    }
}
