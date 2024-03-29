package AssigmentNdClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[]nums = new int[]{8,4,12};
        int numberDivide = 2;
        System.out.println(Arrays.toString(divideTwiceArray(nums, numberDivide)));
//        if (divideAnArray1(nums, numberDivide)){
//            nums = divideAnArray(nums, numberDivide);
////            numbers.add(numberDivide);
//        }
//        System.out.println(numbers);
////        System.out.println(Arrays.toString(divideAnArray(nums, numberDivide)));
//        System.out.println(divideAnArray1(nums, numberDivide));
    }
    public static int[] divideAnArray(int[]numbers, int divisor){
        for (int counter = 0; counter < numbers.length;counter++) {
                numbers[counter] /= divisor;
        }
        return numbers;
    }
    public static int[] divideTwiceArray(int[]nums, int divisor) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int num1 = divideFirstArray(nums, divisor);
        int num2 = divideSecond(nums, divisor);

            if (num1 == divisor) {
                numbers.add(divisor);
            }
            if (num2 == divisor) {
                numbers.add(divisor);
            }
        return convertToArray(numbers) ;
    }

    private static int[] convertToArray(ArrayList<Integer> numbers) {
        int[] results = new int[numbers.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = numbers.get(index);
        }
        return results;
    }

    public static int divideFirstArray(int[]nums, int divisor){
        int counter = 0;
        for (int count = 0; count < nums.length; count++) {
            if (nums[count] % divisor == 0) {
                counter++;
            } else if (nums[count] % divisor != 0) {
                divisor++;
                count--;
            }

        }
        if (counter == 3) {
            nums = divideAnArray(nums, divisor);
        }
        return divisor;
    }

    public static int divideSecond(int[] nums, int divisor){
        int counter = 0;
        for (int count1 = 0; count1 < nums.length; count1++) {
            if (nums[count1] % divisor == 0) {
                counter++;
            } else if (nums[count1] % divisor != 0) {
                divisor++;
                count1--;
            }

        }
        if (counter == 3) {
            nums = divideAnArray(nums, divisor);
        }
        return divisor;
    }
}
