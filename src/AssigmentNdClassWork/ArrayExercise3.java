package AssigmentNdClassWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static AssigmentNdClassWork.Array3.checkingAnArray;

public class ArrayExercise3 {
    public static int[]canReturnHcf(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] factor = canReturnFactors(nums[0]);
        for (int counter = 0; counter < factor.length; counter++){
            if (checkingAnArray(nums, factor[counter])){
                numbers.add(factor[counter]);
                divideAnArray(nums, factor[counter]);
            }
        }
        return convertToArray(numbers);
    }

    private static int[] convertToArray(ArrayList<Integer> numbers) {
        int[] results = new int[numbers.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = numbers.get(index);
        }
        return results;
    }



    public static int[] divideAnArray(int[]numbers, int divisor){
        for (int counter = 0; counter < numbers.length;counter++) {
            numbers[counter] /= divisor;
        }
        return numbers;
    }
    public static int divideFirstArray(int[]nums, int divisor){
        int counter = 0;
        for (int count = 0; count < nums.length; count++) {
            if (nums[count] % divisor == 0) {
                counter++;
            }
            else {
                divisor++;
                count--;
            }
        }
        if (counter == counter) {
            nums = divideAnArray(nums, divisor);
        }
        return divisor;
    }

    public static int divideSecond(int[] nums, int divisor){
        int counter = 0;
        for (int count1 = 0; count1 < nums.length; count1++) {
            if (nums[count1] % divisor == 0) {
                counter++;
            } else {
                divisor++;
                counter--;
            }
        }
        if (counter == counter) {
            nums = divideAnArray(nums, divisor);
        }
        return divisor;
    }

    public static int[] canReturnLcm(int number){
        ArrayList<Integer> number1 = new ArrayList<>();
        int divisor = 2;
        while (number > 1){
            if (number % divisor == 0){
                number1.add(divisor);
                number = number / divisor;
                divisor = 2;
            }
            else {
                divisor++;
            }
        }
        return convertToArray(number1);
    }

    public static int[] canReturnFactors(int nums) {
      ArrayList<Integer> number1 = new ArrayList<>();
      int divideNumber = 2;
      while (divideNumber <= nums){
          if (nums % divideNumber ==0) {
              number1.add(divideNumber);
          }
         divideNumber++;
      }
        return convertToArray(number1);
    }
}

