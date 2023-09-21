package chp5;

public class Triangle1 {
    public int printingTriangle(int number){
        for (int row = 0; row <number; row++) {
            for (int column = 0; column <=row; column++) {
                System.out.print("*" + " ");
            }
            for (int column = 0; column <number-row; column++) {
                System.out.print(" " + " ");
            }
            for (int column = 0; column <number-row; column++) {
                System.out.print("*" + " ");
            }
            for (int column = 0; column <=row; column++) {
                System.out.print(" " + " ");
            }
            for (int column = 0; column <=row; column++) {
                System.out.print(" " + " ");
            }
            for (int column = 0; column <number-row; column++) {
                System.out.print("*" + " ");
            }
            for (int column = 0; column <number-row; column++) {
                System.out.print(" " + " ");
            }
            for (int column = 0; column <row + 1; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return number;
    }
}
