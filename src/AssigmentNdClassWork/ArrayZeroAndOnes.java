package AssigmentNdClassWork;

public class ArrayZeroAndOnes {

    public static int[] canReplacedWithZerosAndOnes(int[] numbers) {
        int[] nums = new int[numbers.length];
        for (int count = 0; count < numbers.length; count++) {
            preformOperation(numbers, count, nums);
        }
        return nums;
    }

    private static void preformOperation(int[] numbers, int count, int[] nums) {
        if (numbers[count] % 2 == 0) nums[count] = 0;
        else nums[count] = 1;
    }

//    public static int[] canReplaceWithZeroAndOnes(int[] numbers){
//
//    }
}
