package AssigmentNdClassWork;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Square.isSquare(25);
    }
    public static boolean isSquare(int number){

        for (int count = 2; count <=number; count++) {
            if (count * count == number) {
                return true;
            }

        }
        return false;
    }
}
