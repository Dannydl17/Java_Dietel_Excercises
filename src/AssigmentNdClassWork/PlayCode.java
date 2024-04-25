package AssigmentNdClassWork;

import chp3.Car;
import task3.User;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayCode {

    public static void main(String[] args) {
     int[] numbers = {4,5,8};
//        {4,5,8,8,10,16}
        System.out.println(Arrays.toString(doubleElements(numbers)));
    }
     public static int[] doubleElements(int[] numbers){
         ArrayList<Integer> results = new ArrayList<>();
         for (int count = 0; count < numbers.length; count++) {
             results.add(numbers[count]);
         }
         for (int count = 0; count < numbers.length; count++) {
             results.add(numbers[count]*2);
         }


         return toCovertArray(results);
     }

    private static int[] toCovertArray(ArrayList<Integer> results) {
        int[] result = new int[results.size()];
        for (int index = 0; index < result.length; index++) {
            result[index] = results.get(index);
        }
        return result;
    }
}
