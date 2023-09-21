package AssigmentNdClassWork;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboardInput.nextInt();


        if(number == 0){
            System.out.println(1);
        } else if (number == 1) {
            System.out.println(0);
        }
    }
}
