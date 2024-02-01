package chp7;

import java.util.Arrays;

public class LabelElement {
    public static void main(String[] args){
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 6; col++) {
                int[][] tables = new int[row][col];
                tables[row][col] = 0;
                System.out.println(Arrays.deepToString(tables));
            }
        }
    }
}
