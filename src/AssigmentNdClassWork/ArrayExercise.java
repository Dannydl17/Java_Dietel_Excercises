package AssigmentNdClassWork;

public class ArrayExercise {

    public static int[] addPlusOneToTheLastIndex(int[] numbers) {
        int[]nums = new int[numbers.length];
        int count = 0;
        for (int num = 0; num < numbers.length; num++) {
            if (num != numbers.length-1) {
                nums[count] = numbers[num];
                count++;
            }
            else {
                nums[count] = numbers[num] + 1;
                count++;
            }
        }
        return nums;
    }
}
