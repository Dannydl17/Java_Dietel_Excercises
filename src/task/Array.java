//package task;
//
//import java.util.Arrays;
//
//public class Array {
//        public static int largeNumber(int[] element) {
//            int largestNumber = element[0];
//            for (int index = 0; index < element.length; index++) {
//                if (element[index] > largestNumber){
//                    largestNumber = element[index];
//                }
//            }
//            return largestNumber;
//        }
//
//        public static int[] reverseNumber(int[] element) {
//            int[] temp = new int[element.length];
//            int count = 0;
//            for (int a = element.length-1; a>=0; a--){
//                temp[count] = element[a];
//                count++;
//                System.out.println(Arrays.toString(temp));
//            }
//            return temp;
//        }
//
//        public static int[] evenNumber(int[] element) {
//            int count =0;
//            for (int counter = 0; counter<element.length; counter++) {
//                if(counter % 2 ==0){
//                    count++;
//                }
//            }
//            int [] evenNumber = new int[count];
//            int newIndex = 0;
//            for (int index = 0; index < element.length; index++) {
//                if (element[index] % 2 ==0) {
//                    evenNumber[newIndex] = element[index];
//                    newIndex++;
//                }
//            }
//            return evenNumber;
//        }
//
//        public static int[] oddNumber(int[] element) {
//            int count =0;
//            for (int counter = 0; counter<element.length; counter++) {
//                if(counter % 2 !=0){
//                    count++;
//                }
//            }
//            int [] oddNumber = new int[count];
//            int newIndex = 0;
//            for (int index = 0; index < element.length; index++) {
//                if (element[index] % 2 !=0) {
//                    oddNumber[newIndex] = element[index];
//                    newIndex++;
//                }
//            }
//            return oddNumber;
//        }
//
//        public static boolean checkElement(int[] element) {
//            int counter = element[2];
//            for (int count = 0; count < element.length; count++) {
//                if (element[count] == counter) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        public static int runningTotal(int[] element) {
//            int numberOfRunningTotal = 0;
//            for (int index = 0; index < element.length; index++) {
//                numberOfRunningTotal= numberOfRunningTotal+element[index];
//            }
//            return numberOfRunningTotal;
//        }
//
//        public static int sum(int[] element) {
//            int numberOfSum = 0;
//            for (int index = 0; index < element.length; index++) {
//                numberOfSum= numberOfSum+element[index];
//            }
//            return numberOfSum;
//        }
//
//
//        public static int sum1(int[] element) {
//            int numberOfSum = 0;
//            int index = 0;
//            while (index < element.length) {
//                numberOfSum= numberOfSum+element[index];
//                index++;
//            }
//            return numberOfSum;
//        }
//
//        public static int sum2(int[] element) {
//            int numberOfSum = 0;
//            int index = 0;
//            do {
//                numberOfSum= numberOfSum+element[index];
//                index++;
//            }
//            while (index < element.length);
//            return numberOfSum;
//        }
//
//
//        public static boolean isPalindrome(String[] element) {
//            String reverse = "";
//            String name = String.valueOf(element.length);
//            for (int count =element.length -1; count>=0; count--) {
//                reverse = reverse + name.charAt(count);
//            }
//            if (reverse.equals(name)) {
//                return true;
//            }
//            return false;
//        }
//
//        public static char[] concatenateList(char[] givenFirstList, int[] givenSecondList) {
//        }
//
//
//    /*  int count = 0;
//        for (int index = 0; index < givenFirstList.length; index++) {
//            count++;
//        }
//        System.out.println(count);
//        int num = 0;
//        int number;
//        for (number = 0; number < givenSecondList.length; number++) {
//            num++;
//        }
//        int total = count + num;
//        char[] numbers = new char[total];
//        System.out.println(num);
//
//        int add = 0;
//        for (int index = 0; index < givenFirstList.length; index++) {
//            numbers[add] = givenFirstList[index];
//            add++;
//        }
//        char adding = 0;
//        for (int index = 0; index < givenSecondList.length; index++) {
//            adding =  givenSecondList[index];
//            System.out.println(numbers);
//        }
//        System.out.println(numbers);
//        return numbers;*/
//
//
