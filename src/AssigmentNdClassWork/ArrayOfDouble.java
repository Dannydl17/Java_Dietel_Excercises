package AssigmentNdClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfDouble {
     public static int[] doubleElements(int[] numbers){
        int[]nums = new int[numbers.length * 2];
         for (int count = 0; count < numbers.length; count++) {
               nums[count] = numbers[count];
               nums[count + numbers.length] = numbers[count]+numbers[count];
             System.out.println(Arrays.toString(nums));
         }
         return nums;
     }

    private static int[] toCovertArray(ArrayList<Integer> results) {
        int[] result = new int[results.size()];
        for (int index = 0; index < result.length; index++) {
            result[index] = results.get(index);
        }
        return result;
    }
}
