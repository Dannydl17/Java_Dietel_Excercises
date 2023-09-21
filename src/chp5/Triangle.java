package chp5;

public class Triangle {
    public static void main(String[] args) {
        for (int row = 0; row <10; row++) {
            for (int column =0; column <= row; column++) {
                System.out.print("*" + " ");
            }
            for (int column = 0; column <= 9-row; column++) {
                System.out.print(" " +  " ");
            }

            for (int column = 0; column < 10-row; column++) {
                System.out.print("1" + " ");
            }
            for (int column =0; column <= row; column++) {
                System.out.print(" " + " ");
            }
            for (int column =0; column <= row; column++) {
                System.out.print(" " + " ");
            }
            for (int column = 0; column < 10-row; column++) {
                System.out.print("*" + " ");
            }
            for (int column = 0; column < 10-row; column++) {
                System.out.print(" " + " ");
            }
            for (int column =0; column <= row; column++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
