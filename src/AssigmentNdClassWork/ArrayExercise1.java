package AssigmentNdClassWork;

public class ArrayExercise1 {
    public static int highestOccurrence(int[] number) {
        int numberFound = 0;
        int max = 0;
        for (int count = 0; count < number.length; count++) {
            int counter = 0;
            for (int innerIndex = 0; innerIndex < number.length; innerIndex++) {
                if (number[count] == number[innerIndex]) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                numberFound = number[count];
            }
        }
        return numberFound;
    }
}
