package chp6;

public class LeapYear {

    public static int collectInput(int numberOfYear) {
           return numberOfYear;
    }

    public static String testLeapYear(int numberOfYear) {
         int number = 4;
        if (numberOfYear % number == 0) {
            return "is a leapYear";
        }
        else {
             return "is not a leapYear";
        }
    }
}
