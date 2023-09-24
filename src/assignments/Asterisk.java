package assignments;

public class Asterisk {
    public static void main(String[] args) {
     printTriangle(5);
     printTriangleReversed(4);
    }
    public static void printTriangle(int numberOfStar){
        for (int row = 0; row <numberOfStar; row++) {
            printStar(row);
        }
    }

    public static void printStar(int row){
        for (int column = 0; column <= row; column++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }

    public static void printTriangleReversed(int numberOfStar){
        for (int row = numberOfStar; row>0; row--) {
            printReversedStar(row);
        }
    }

    public static void printReversedStar(int row){
        for (int column =row; column>0; column--) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}



