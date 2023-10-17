package tdd;

import AssigmentNdClassWork.MultidimensionalArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultidimensionalArrayTest {

    @Test
    void canExtractDataFromDataSetGivenTheRow() {
//        Given
        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
        int[][] numbers = {
                {4, 2, 4, 1},
                {6, 8, 3, 6},
                {2, 6, 8, 2},
                {5, 8, 2, 6}
        };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;
//        When
        int[] result = multidimensionalArray
                       .extractByRow(numbers, row, startPosition, endPosition);
//        Assert
        assertEquals(8, result[0]);
        assertEquals(3, result[1]);
        assertEquals(6, result[2]);
        assertEquals(3, result.length);
    }




    @Test
    void canExtractDataFromDataSetGivenTheColumn(){
//        Given
        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
        int[][] numbers = {
                {4,2,4,1},
                {6,8,3,6},
                {2,6,8,2},
                {5,8,2,6}
        };
        int column = 2;
        int startPosition = 2;
        int endPosition = 4;
//        When

        int[] result = multidimensionalArray
                .extractByColumn(numbers, column, startPosition, endPosition);
//        Assert
        assertEquals(8, result[0]);
        assertEquals(6, result[1]);
        assertEquals(8, result[2]);
        assertEquals(3, result.length);
    }
}