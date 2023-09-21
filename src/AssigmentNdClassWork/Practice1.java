package AssigmentNdClassWork;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter several numbers or -1 to stop: ");
        int number = keyboardInput.nextInt();

        int minimumNumber = number;
        int count =0;
        while (number != -1){
            if (number < minimumNumber){
                minimumNumber = number;
            }

            System.out.print("Enter several numbers or -1 to stop: ");
            number = keyboardInput.nextInt();

        }
        System.out.println("The minimumNumber is: "+ minimumNumber);
    }
}
