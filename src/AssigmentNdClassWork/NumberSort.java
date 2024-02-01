package AssigmentNdClassWork;

public class NumberSort {
    public static int[] sort(int[] numbers) {
        int[] elements = new int[numbers.length];
        for (int counter = 0; counter < numbers.length;) {
            int nums = numbers[counter];
            int count;
            for (count = counter +1; count < numbers.length;  count++) {
                if (nums > numbers[count]) break;
            }
            if (count == numbers.length) {
                elements[counter] = nums;
                counter++;
            }else {
                int temp = numbers[count];
                numbers[count] = nums;
                numbers[counter] = temp;
            }
        }
        return elements;
    }
}
