package AssigmentNdClassWork;

public class ArrayExercise {

    public static int[] addPlusOneToTheLastIndex(int[] numbers) {
        String result = "";
        for (int num = 0; num < numbers.length; num++) {
            if (num != numbers.length-1) {
                result += numbers[num];
            }
            else {
                result += numbers[num] + 1;
            }
        }
        return toArray(result);
    }

    private static int[] toArray(String result) {
        int [] array = new int[result.length()];
        for (int count = 0 ; count < result.length(); count++){
            array[count] = Integer.parseInt(String.valueOf(result.charAt(count)));
        }
        return array;
    }
}
