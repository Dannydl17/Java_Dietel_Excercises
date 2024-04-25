package AssigmentNdClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    static ArrayList<Integer> numbersAdded = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = new int[]{8,16,12,6};
        int number = 2;
        System.out.println(Arrays.toString(divideNumbers(number, nums)));
    }

    private static int[] divideNumbers(int number, int... nums) {
//        int[] numbers = new int[nums.length];

        int counter = 0;
        int counterPlus = 0;

        for (int count = 0; count < nums.length; count++) {
            if (nums[count] == 1) {
                counterPlus++;
            }

            if (nums[count] % number == 0) {
                nums[count] = nums[count] / number;
            }
            else {
            nums[count] = nums[count];
               counter++;
            }
        }

        if (counterPlus == 4) {
            System.out.println(numbersAdded);
            return nums;
        }
        if (counter == 4) {
            number++;

          return divideNumbers(number, nums);
        }
           numbersAdded.add(number);

//        System.out.println(Arrays.toString(numbers));
        return divideNumbers(number, nums);
    }
}



