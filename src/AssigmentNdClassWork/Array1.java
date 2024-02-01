package AssigmentNdClassWork;

public class Array1 {

    public static int returnNonDuplicate(int[] number) {
        int nonDuplicate = 0;
        int counter = 0;
        for (int firstLoop = 0; firstLoop < number.length; firstLoop++) {
            for (int secondLoop = 0 ; secondLoop < number.length; secondLoop++) {
                if (number[firstLoop] == number[secondLoop]) {
                    counter++;
                }
            }
            if (counter == 1){
                nonDuplicate = number[firstLoop];
            }
            counter = 0;
        }
        return nonDuplicate;
    }
}
