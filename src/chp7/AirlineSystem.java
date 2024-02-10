package chp7;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class AirlineSystem {
     private static Boolean[] seatingCharts = new Boolean[]{false, false, false, false, false, false, false, false, false, false};
     private static Scanner keyboardInput = new Scanner(in);
     private static List<Integer> nums = new ArrayList<>();
     public static void main(String[] args) {
        System.out.println(welcome());
        bookingContinue();
    }
    public static String welcome(){
        System.out.println("Do you want to book a flight");
        System.out.println("Enter yes or no?");
        String userInput = keyboardInput.next();
        if (userInput.equals("yes")) {
            return bookingQuestion();
        }
         else {
            return bookingNotOrder();
        }
    }
    public static String bookingQuestion(){
            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");
            int typesBooking = keyboardInput.nextInt();
            String result = validateFirstClass();
            if (!result.isEmpty()) return result;
            else return firstClass();
    }

    public static String firstClass(){
        int value = generate();
        System.out.println(value);
        String result = "";
        for (int count1 = 0; count1 < seatingCharts.length; count1++) {
            if (count1 == value) {
                seatingCharts[count1] = true;
                System.out.println(Arrays.toString(seatingCharts));
                 result = "Your seat number is = " + value;
            }
        }
        return result;
    }

    private static String validateFirstClass() {
        String result = "";
        for (int count = 0; count < 5; count++){
            if (!seatingCharts[count])break;
            if (count == 4){
                result = "Space all ready filled for first class";
            }
        }
        return result;
    }

    private static int generate() {
        SecureRandom secureRandom = new SecureRandom();
        int value = secureRandom.nextInt(0, 5);
        if (nums.size() != 5) {
            while (nums.contains(value)) {
                value = secureRandom.nextInt(0, 5);
            }
        }
        if (!nums.contains(value)){
            nums.add(value);
        }
        return value;
    }

    private static int generate1() {
        SecureRandom secureRandom = new SecureRandom();
        int value = secureRandom.nextInt(5, 9);
        if (nums.size() != 5) {
            while (nums.contains(value)) {
                value = secureRandom.nextInt(5, 9);
            }
        }
        if (!nums.contains(value)){
            nums.add(value);
        }
        return value;
    }

    public static String economyClass(){
        int value1 = generate1();
        String result1 = "";
        for (int count = 0; count < seatingCharts.length; count++) {
            if (count == value1) {
                seatingCharts[count] = true;
                System.out.println(Arrays.toString(seatingCharts));
                result1 = "Your seat number is = " + value1;
            }
        }
        return result1;
    }


    public static void bookingContinue(){
        boolean requestContinue = true;
        while (requestContinue){
              System.out.println("Do you want to continue enter yes or no? ");
              String userInput = keyboardInput.next();
             if (userInput.equals("yes")){
                 System.out.println(bookingQuestion());
             }
            if (userInput.equals("no")) {
                 System.out.println(bookingNotOrder());
                 requestContinue = false;
            }
        }

    }

    public static String bookingNotOrder(){
        return "Thanks and Goodbye";
    }
}
