package AssigmentNdClassWork;

import java.util.ArrayList;

public class Hcf1 {
    public static void main(String[] args) {
        int[] nums = new int[]{8,16,12};
        int number = 2;
        checkNumbers(number, nums);
    }
    public static int[] checkNumbers(int divisor, int...nums) {
        int count=0;
        while(nums[count]!= 1){
            System.out.println(nums[count]);
        }
        return new int[0];
    }

    private static int divideNumber(int num, int divisor) {
        int nums = num / divisor;
        return nums;
    }

}


