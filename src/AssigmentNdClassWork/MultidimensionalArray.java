package AssigmentNdClassWork;
import java.util.Arrays;

public class MultidimensionalArray {

    public int[] extractByRow(int[][] numbers, int row, int startPosition, int endPosition) {
       int[] numberRow = numbers[row - 1];
        System.out.println(Arrays.toString(numberRow));
        int[] extractedData = new int[(endPosition - startPosition) + 1];
        int count = 0;
        for (int index = startPosition - 1; index < endPosition; index++) {
            extractedData[count] = numberRow[index];
            System.out.println(Arrays.toString(extractedData));
            count++;
        }
        return extractedData;
    }

    public int[] extractByColumn(int[][] numbers, int column, int startPosition, int endPosition) {
//        int[] numberColumn = numbers[6 - column];
//        System.out.println(Arrays.toString(numberColumn));
        int [] columns = new int[(endPosition - startPosition) + 1];
        int count = 0;
        for (int number = startPosition - 1; number < endPosition ; number++) {
             columns[count] = numbers[number][column - 1];
             count++;
        }
        return columns;
    }
}
