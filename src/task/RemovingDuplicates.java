package task;

import java.util.Arrays;

public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 4, 5, 6};
        System.out.println(Arrays.toString(canRemoveDuplicate(array)));
    }
    public static int[] canRemoveDuplicate(int[] element) {
        int count = 0;
        for (int index = 0; index < element.length; index++) {
            for (int row = index + 1; row < element.length; row++) {
                if (element[row] == element[index]) {
                    count++;

                }
            }
        }
        int[] number = new int[count];
        int counter = 0;
        for (int index = 0; index <element.length; index++) {
            for (int row = index + 1; row < element.length; row++) {
                int nums = element[row];

                if (nums == element[index]) {
                    number[counter] = nums;
                    counter++;
                }

            }

        }
        return number;
    }
}
