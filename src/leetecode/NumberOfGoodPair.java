package leetecode;

public class NumberOfGoodPair {

    public static void main(String[] args) {
        int[] number = {1,2,3,1,1,3};
        System.out.println(countTheNumberOfGood(number));
    }
    public static int countTheNumberOfGood(int[] element) {
        int counter = 0;
        for (int count = 0; count < element.length; count++) {
            for (int index = count + 1; index < element.length; index++) {
                if (element[count] == element[index]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
