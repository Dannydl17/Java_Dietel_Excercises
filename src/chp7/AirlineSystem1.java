package chp7;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class AirlineSystem1 {
    private static Boolean[] seatingChart = new Boolean[]{false, false, false, false, false, false, false, false, false, false};
    private static Scanner keyboardInput = new Scanner(in);
    private static List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(welcome());

        bookingContinue();
    }

    public static String welcome() {
        System.out.println("Hello, welcome to virgin airline reservation");
        System.out.println("Do you want to book a flight? ");
        System.out.println("Press yes to book a flight or Press no to exist");
        String userInput = keyboardInput.next();
        if (userInput.equals("yes")) {
            return bookingQuestions();
        }
        else {
            return bookingNotOrder();
        }
    }

    public static String bookingQuestions() {
        System.out.println("Please type 1 for First Class");
        System.out.println("Please type 2 for Economy");
        int typesBooking = keyboardInput.nextInt();
        String result = validateResult();
        if (typesBooking == 1) {
            if (!result.isEmpty()) return result;
            else return firstClass1();
        }
        if (typesBooking == 2){
            return economyClass1();
        }else {
            return "invalid input";
        }

    }

    private static String validateResult() {
        String answers = "";
        for (int count = 0; count < 5; count++) {
            if (!seatingChart[count]) break;
            if (count == 4) {
                answers = "Seat already taking";
            }
        }
        return answers;
    }

    private static String validateResult1() {
        String answers = "";
        for (int count = 5; count < 9; count++) {
            if (!seatingChart[count]) break;
            if (count == 9) {
                answers = "Seat already taking";
            }
        }
        return answers;
    }

    public static String firstClass1() {
        int value1 = generateNum();
        String result = "";
        for (int count = 0; count < seatingChart.length; count++) {
            if (count == value1) {
                seatingChart[count] = true;
                System.out.println(Arrays.toString(seatingChart));
                result = "Your seat number is = " + value1;
            }
        }
        return result;
    }

    public static void question() {
        System.out.println("Do you mind choosing from the economy? yes or no");
        String userInput = keyboardInput.next();
        if (userInput.equals("yes")){
            bookingQuestions();
        }
    }

    public static String economyClass1() {
        int value2 = generateNum();
        String result = "";
        for (int count = 0; count < seatingChart.length; count++) {
            if (count == value2) {
                seatingChart[count] = true;
                System.out.println(seatingChart[count]);
                result = "Your seat number is = " + value2;
            }
        }
        return result;
    }

    private static int generateNum() {
        SecureRandom random = new SecureRandom();
        int value = random.nextInt(0,5);
        if (nums.size() != 5) {
             while(nums.contains(value)){
                 value = random.nextInt(0,5);
             }
        }
        if (!nums.contains(value)) {
           nums.add(value);
        }
        return value;
    }

    public static void bookingContinue(){
        boolean requestContinue = true;
        while (requestContinue){
            System.out.println("Do you want to continue enter yes or no? ");
            String userInput = keyboardInput.next();
            if (userInput.equals("yes")){
                System.out.println(bookingQuestions());
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
