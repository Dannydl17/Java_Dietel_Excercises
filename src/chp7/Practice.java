package chp7;

public class Practice {

    public static void main(String[] args) {
        final int Array_length = 10;
        int[] array = new int[Array_length];

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
             System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
