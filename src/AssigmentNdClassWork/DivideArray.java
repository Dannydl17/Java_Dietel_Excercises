package AssigmentNdClassWork;

import java.util.Arrays;

public class DivideArray {
    public static void main(String[] args) {
        int[]nums = new int[]{8,4,12};
        int numberDivide = 2;
        System.out.println(Arrays.toString(divideAnArray(nums, numberDivide)));
    }
    public static int[] divideAnArray(int[]numbers, int divisor){
        for (int counter = 0; counter < numbers.length;counter++) {
            numbers[counter] /= divisor;
        }
        return numbers;
    }
}
