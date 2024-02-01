package chp7;

public class PassArray {
    public static void main(String[] args) {
        int[] array = {5,6,7,8,9,10};

        System.out.printf(
        "Effects of passing reference to entire array:%n" +
        "The values of the original array are:%n");

        for (int value : array) {
            System.out.printf(" %d", value);
        }

        modifyArray(array);
        System.out.printf("%n%nThe values of the modified array are:%n");

        for (int value : array) {
            System.out.printf(" %d", value);
        }

        System.out.printf(
        "%n%nEffects of passing array element value:%n" +
        "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]);

        System.out.printf("array[3] after modifyElement: %d%n", array[3]);
}
    public static void modifyArray(int[] array2) {
        for (int count = 0; count < array2.length; count++) {
            array2[count] *=2;
        }
    }

    public  static void modifyElement(int element){
        element *=2;
        System.out.printf(
        "Value of element in modifyElement: %d%n", element);
    }
}
