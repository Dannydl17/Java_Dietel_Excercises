package AssigmentNdClassWork;

public class Array3 {
    public static void main(String[] args) {
        int[]nums = new int[]{8,4,12};
        int numberDivide = 2;
        System.out.println(checkingAnArray(nums, numberDivide));
    }
    public static boolean checkingAnArray(int[]numbers, int divisor){
        int counter = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count]% divisor ==0) {
                counter++;
            }
        }
        if (counter == numbers.length ) {
            divideAnArray(numbers, divisor);
//            return true;
        }
        return false;
    }

    public static int[] divideAnArray(int[]numbers, int divisor){
        for (int counter = 0; counter < numbers.length;counter++) {
            numbers[counter] /= divisor;
        }
        return numbers;
    }
}
