package task2;

import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        displayMethod();
    }
    public static void displayMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify");
        String cardNumber = scanner.nextLine();


        System.out.printf("Credit Card Type %s%n", getCardType(cardNumber));
        System.out.printf("Credit Card Number %s%n", collectInput(cardNumber));
        System.out.printf("Credit Card Digit Length %d%n", getSize(cardNumber));
        System.out.printf("Credit Card Validity Status %s", addNumberTogether(doubleSecondDigit(cardNumber), oddPlaceDigit(cardNumber)));
        doubleSecondDigit(cardNumber);
        oddPlaceDigit(cardNumber);

    }
    public static String collectInput(String number) {
        return number;
    }
    public static Object getCardType(String number) {
        char nums;
        nums = number.charAt(0);
        if (nums == '4') {
            return "Visa Card";
        }
        if (nums == '5') {
            return "Master Card ";
        }
        if (number.charAt(0) == '3' && number.charAt(1) == '7') {
            return "American Express Card";
        }
        if (nums == '6') {
            return "Discover Card ";
        }
        return "Invalid Card Type";
    }

    public static int getSize(String number){
        return number.length();
    }

    public static int doubleSecondDigit(String number) {
        int[] numbers = new int[number.length()];
        int count = 0;
        for (int index = 0; index < number.length(); index++) {
            numbers[count] = Integer.parseInt(String.valueOf(number.charAt(index)));
            count++;
        }

        int counter = 0;
        for (int index = numbers.length-2; index >=0; index-=2) {
            counter++;
//            System.out.println(numbers[index]);
        }
        int[]evenNumber = new int[counter];
        int newIndex = 0;
        int num = 0;
        for (int index = numbers.length - 2; index>=0; index-=2) {
            int multiply = numbers[index] * 2;
            if (multiply > 9){
                evenNumber[newIndex] = (multiply / 10) + (multiply % 10);
            }else evenNumber[newIndex] = multiply;
            newIndex++;
//            System.out.println(multiply);
        }
        for (int index = 0; index < evenNumber.length; index++) {
            num+=evenNumber[index];
        }
        return num;
    }

    public static int oddPlaceDigit(String number) {
        int[] numbers = new int[number.length()];
        int count = 0;
        for (int index = 0; index < number.length(); index++) {
            numbers[count] = Integer.parseInt(String.valueOf(number.charAt(index)));
            count++;
        }
        int counter = 0;
        for (int index = numbers.length -1; index >0; index-=2) {
            counter++;
//            System.out.println(numbers[index]);
        }
        int[]oddPosition = new int[counter];
        int newIndex = 0;
        for (int index = numbers.length-1; index >=0; index-=2) {
            oddPosition[newIndex] = numbers[index];
            newIndex++;
        }
        int num1 = 0;
        for (int nums = 0; nums < oddPosition.length; nums++) {
            num1 += oddPosition[nums];
        }
        return num1;
    }

    public static String addNumberTogether(int num, int num1) {
        int number = num + num1;
        if (number % 10 == 0) {
            return "It is valid";
        }
        return "It is invalid";

    }
}
