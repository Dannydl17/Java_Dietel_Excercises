package AssigmentNdClassWork;

public class ArrayOfBoolean {

    public static boolean[] canReplacedWithBoolean(int[] numbers) {
        boolean[] nums = new boolean[numbers.length];
        for (int count = 0; count < numbers.length; count++) {
            preformOperation(numbers, count, nums);
        }
        return nums;
    }

    private static void preformOperation(int[] numbers, int count, boolean[] nums) {
        if (numbers[count] % 2 == 0) nums[count] = false;
        else nums[count] = true;
    }
}
