package AssigmentNdClassWork;

import java.util.Arrays;

public class ArrayEvenNumber {
    public static void main(String[] args) {
        int nums = evenNumber(new int[]{1, 2, 3, 4, 5, 6, 7,});
        System.out.println(nums);
    }
    public static int evenNumber(int[] element) {
        int evenNumber = 0;
        for (int index = 0; index < element.length; index++) {
//            if (element[index] % 2 ==0){
                evenNumber += element[index];
//                System.out.println(evenNumber);

//            }

        }
        return evenNumber;
    }
}
