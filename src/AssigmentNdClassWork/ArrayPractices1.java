package AssigmentNdClassWork;

public class ArrayPractices1 {
    public static void main(String[] args) {
        int[] number;
        number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        for (int index = 0; index < number.length; index++) {
            System.out.println(number[index]);
        }
    }
}
