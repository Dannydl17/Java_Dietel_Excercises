package task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Hcf {

    public static int[] canReturnNUmberDivisible(int nums) {
        ArrayList<Integer> result = new ArrayList<>();
         int divisor = 2;
         while (nums > 1){
             if (nums % divisor == 0) {
                 result.add(divisor);
                 nums = nums / divisor;
                 divisor = 2;
             }
             else {
                 divisor++;
             }
         }
        return convertToArray(result);
    }

    private static int[] convertToArray(ArrayList<Integer> result) {
        int[] results = new int[result.size()];
        for (int index = 0; index < results.length; index++) {
            results[index] = result.get(index);
        }
        return results;
    }
}
