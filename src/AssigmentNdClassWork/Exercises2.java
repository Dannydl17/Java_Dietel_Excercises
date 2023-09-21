package AssigmentNdClassWork;

public class Exercises2 {
    public static void main(String[] args) {
    }
 public static boolean palindrome(int number) {

     int result = number / 10000 % 10;
     int result2 = number % 10;

     if (result == result2) {
         return true;
     }
     return false;
 }
}

