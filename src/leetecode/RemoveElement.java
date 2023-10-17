package leetecode;

import java.util.Arrays;

public class RemoveElement {

        public static void main(String[] args) {
            int[] array = {1, 3, 2, 4, 1, 5, 6, 2, 3, 4,};
            int val = 3;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == val) {
                        array[i] = 0;
                    }
                }
            }
            int count = 0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] != 0) {
                    count++;
                }
            }
            int[] newList = new int[count];
            int newIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    newList[newIndex] = array[i];
                    newIndex++;
                }
            }
            System.out.println(Arrays.toString(newList));
        }
    }
