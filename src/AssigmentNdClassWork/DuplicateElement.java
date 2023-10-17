package AssigmentNdClassWork;

import java.util.Arrays;

public class DuplicateElement {

    public static int[] canCompareElement(int[] element){
        for (int index = 0; index < element.length; index++) {
            for (int innerIndex = index + 1; innerIndex < element.length; innerIndex++) {
                if (element[innerIndex] == element[index]) {
                    element[innerIndex] = 0;
                }
            }
        }
        return element;
    }

    public static int canCalculateElement(int[] element) {
        int count = 0;
        for (int index = 0; index < element.length; index++) {
            if (element[index] != 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] canReturnAnArray(int[] element){
        int count = 0;
        for (int index = 0; index < element.length; index++) {
            if (element[index] != 0) {
                count++;
            }
        }

        int[] number = new int[count];
        int newIndex = 0;
        for (int index = 0; index < element.length; index++) {
            if (element[index] != 0) {
                number[newIndex] = element[index];
                newIndex++;
            }
        }
        return number;
    }

}

