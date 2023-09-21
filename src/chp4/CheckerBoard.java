package chp4;

public class CheckerBoard {
    public static void main(String[] args) {
        for (int row = 1; row <5; row++) {
            for (int column = 0; column <=8; column++) {
                for (int innerColumn = 0; innerColumn < 1; innerColumn++) {
                    System.out.print("*");
                }
                for (int innerColumn = 0; innerColumn < 1; innerColumn++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int column =0; column <=8; column++) {
                for (int innerColumn = 0; innerColumn < 1; innerColumn++) {
                    System.out.print(" ");
                }
                for (int innerColumn = 0; innerColumn < 1; innerColumn++) {
                    System.out.print("*");
                }
           }
            System.out.println();

        }
    }
}
