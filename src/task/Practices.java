package task;

import java.util.Arrays;

public class Practices {
    public static void main(String[] args) {
     arrays();
    }
    public static void arrays(){
        int[][] number = new int[2][2];
        number[0][0] = 1;
        number[0][1] = 2;
        number[1][0] = 3;
        number[1][1] = 4;

        for (int index = 0; index < number.length; index++) {
            pintInnerColumn(number, index);
        }
    }

    public static void pintInnerColumn(int[][] number, int index){
        for (int innerColumn = 0; innerColumn < number.length; innerColumn++) {
            System.out.print(number[index][0] + " ");
        }
    }
}
