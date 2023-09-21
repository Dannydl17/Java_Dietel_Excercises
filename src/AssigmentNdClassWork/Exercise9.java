package AssigmentNdClassWork;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
     Exercise9 exercise9 = new Exercise9();
     int number  = exercise9.collectNumber(56);
        System.out.println(number);

      exercise9.calculateMinimumNumber();
      exercise9.calculateMaximumNumber();
    }

    public int collectNumber(int number){
       return number;
    }


    public void calculateMinimumNumber(){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter several numbers or -1 to stop: ");
        int number = keyboardInput.nextInt();

        int minimumNumber = number;

        for (int index = 1; index < 20; index++) {
             if (number < minimumNumber){
                 minimumNumber = number;
             }

            System.out.print("Enter several numbers or -1 to stop: ");
            number = keyboardInput.nextInt();

        }
        System.out.println("The minimumNumber is: " + minimumNumber);
    }

    public void calculateMaximumNumber(){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter several numbers or -1 to stop: ");
        int number = keyboardInput.nextInt();

        int maximumNumber = number;

        for (int index = 1; index < 20; index++) {
            if (number > maximumNumber){
                maximumNumber = number;
            }

            System.out.print("Enter several numbers or -1 to stop: ");
            number = keyboardInput.nextInt();

        }
        System.out.println("The maximumNumber is: " + maximumNumber);
    }
}
