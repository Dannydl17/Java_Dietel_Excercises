package AssigmentNdClassWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExercise2 {
//    public static void main(String[] args) {
//        int[] lol = {2,4,6,8,7,8};
//        System.out.println(Arrays.toString(canAddTwoEvenPosition(lol)));
//    }

    public static int[] canAddTwoPosition(int[] numberArrays) {
        ArrayList<Integer> sum = new ArrayList<>();
        int length = numberArrays.length;
        for (int count = 0; count < numberArrays.length; count+=2) {
            if (numberArrays.length % 2 != 0) {
                length = numberArrays.length - 1;
            }
            if (count < length) {
                sum.add(numberArrays[count] + numberArrays[count + 1]);
            }
        }
//        sum.add(numberArrays[numberArrays.length-1]);
        int[] convert = new  int[sum.size()];
        for (int i = 0; i < sum.size(); i++) {
            convert[i] = sum.get(i);
        }
         return convert;
    }

}
