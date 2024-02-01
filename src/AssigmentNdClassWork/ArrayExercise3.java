package AssigmentNdClassWork;

import java.util.ArrayList;

public class ArrayExercise3 {

    public static int [] canReturnHcf(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int num1 = 0;
        int counter = 0;
        int divisor = 2;
        for (int count = 0; count < nums.length; count++) {
            num1 = nums[count];
            while (num1 > 1){
                if (num1 % divisor == 0) {
                     numbers.add(divisor);
                     num1 = num1 / divisor;
                     divisor = 2;
                }
                else {
                    divisor++;
                }
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
}

