package chp4;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
       Scanner keyboardInput = new Scanner(System.in);

       int passes = 0;
       int failures = 0;
       int studentCounter = 1;
       int result;

       while (studentCounter <= 10){
           System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = keyboardInput.nextInt();
           if (result == 1) {
               passes = passes + 1;
               studentCounter = studentCounter + 1;
           } else if (result == 2) {
               failures = failures + 1;
               studentCounter = studentCounter + 1;
           }
           else{
               System.out.println("Invalid Input");
           }
       }
        System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );
    }
}
