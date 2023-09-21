package AssigmentNdClassWork;


public class ArraysToMethods {
    public static void main(String[] args) {
        int[] numbers = {6, 1};
        change(numbers);
        printArray(numbers);
    }

    private static void change(int[] numbers) {
        numbers[0] = 7;
        numbers[1] = 5;
    }
    public static void printArray(int[] numbers){
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
    }
}
