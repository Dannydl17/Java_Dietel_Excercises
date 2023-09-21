package chp5;

public class Diamond {
    public static void main(String[] args)  {
        for (int row = 1; row>0; row--) {
            for (int column =0; column <=7; column++) {
                System.out.print(" ");
            }
            for (int column = 0; column<1; column++) {
                System.out.print(" *");
            }
            System.out.println();

            for (int column =0; column<=7; column++) {
                System.out.print(" ");
            }
            for (int inColumn =0; inColumn<3; inColumn++) {
                System.out.print("*");
            }
            System.out.println();

            for (int column =0; column<=6;column++) {
                System.out.print(" ");
            }
            for (int column =0; column<5; column++) {
                System.out.print("*");
            }
            System.out.println();

            for (int column =0; column<=5;column++) {
                System.out.print(" ");
            }
            for (int column =0; column<7; column++) {
                System.out.print("*");
            }
            System.out.println();

            for (int column =0; column<=4;column++) {
                System.out.print(" ");
            }
            for (int column =0; column<9; column++) {
                System.out.print("*");
            }
            System.out.println();

            for (int column =0; column<=5;column++) {
                System.out.print(" ");
            }
            for (int column =7; column>0; column--) {
                System.out.print("*");
            }
            System.out.println();

            for (int column =0; column<=6;column++) {
                System.out.print(" ");
            }
            for (int column =5; column>0; column--) {
                System.out.print("*");
            }
            System.out.println();

            for (int column =0; column<=7; column++) {
                System.out.print(" ");
            }
            for (int inColumn =3; inColumn>0; inColumn--) {
                System.out.print("*");
            }
            System.out.println();

            for (int column =0; column <=7; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column>0; column--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

