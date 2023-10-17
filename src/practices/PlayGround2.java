//package practices;
//
//import java.util.Scanner;
//
//public class PlayGround2 {
//    public static void main(String[] args) {
//        public static void userPrompt(){
//            Scanner keyboardInput = new Scanner(System.in);
//            System.out.println("Hello, kindly Enter Card details to verify:  ");
//            long number = keyboardInput.nextLong();
//
//        }
//
//
//        public static int secondDouble(long number){
//            long num = 0;
//            long num1 = 0;
//            long num2 = 0;
//            long num3 = 0;
//            long num4 = 0;
//            long num5 = 0;
//            long num6 = 0;
//            long num7 = 0;
//
//            num = (number % 100/10)*2;
//            num1 = (number % 10000/1000)*2;
//            num2 = (number % 1000000/100000)*2;
//            num3 = (number % 100000000/10000000)*2;
//            num4 = (number % 10000000000L/1000000000)*2;
//            num5 = (number % 1000000000000L/100000000000L)*2;
//            num6 = (number % 100000000000000L/10000000000000L)*2;
//            num7 = (number % 10000000000000000L/1000000000000000L)*2;
//
//            int fourthNum = (int) ((num4 % 100 / 10) + (num4 % 10));
//            int fifthNum = (int) ((num5 % 100 / 10) +  (num5 % 10));
//            int sixthNum = (int) ((num6 % 100 / 10) + (num6 % 10));
//
//            int finalNum = (int) (num + num1 + num2 + num3 + fourthNum + fifthNum + sixthNum + num7);
//            return finalNum;
//        }
//        public static String isValid(long number){
//            int total = secondDouble(number) + oddDigit(number);
//            if (total % 10 == 0){
//                return "valid";
//            }
//            else {
//                return "invalid";
//            }
//        }
//
//        public static int getSize(long number) {
//            return 0;
//        }
//
//
//        public static int getCardType(long number, int d) {
//            if ((getCardType(number, d) == 4)
//                    || (getCardType(number, d) == 5)
//                    || (getCardType(number, d) == 37)
//                    || (getCardType(number, d) == 6)){
//
//                if (getCardType(number, d) == 4) {
//                    System.out.println("Visa Card ");
//                }
//
//                else if (getCardType(number, d) == 5) {
//                    System.out.println("Master Card ");
//                }
//                else if (getCardType(number, d) == 37) {
//                    System.out.println("American Express Card ");
//                }
//                else if (getCardType(number, d) == 6) {
//                    System.out.println("Discover Card ");
//                }
//            }
//            return d;
//        }
//
//        public static int oddDigit(long number){
//            int first = (int) (number % 10);
//            int second = (int) (number % 1000/100);
//            int third = (int) (number % 100000/10000);
//            int fourth = (int)(number % 10000000/1000000);
//            int fifth = (int) (number % 1000000000/100000000);
//            int sixth = (int) (number % 100000000000L/10000000000L);
//            int seven = (int) (number % 10000000000000L/1000000000000L);
//            int eight = (int) (number % 1000000000000000L/100000000000000L);
//            int total = first + second + third + fourth + fifth + sixth + seven + eight;
//            return total;
//        }
//    }
//}
