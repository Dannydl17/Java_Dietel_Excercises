package AssigmentNdClassWork;

public class Triangle {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        for (int row = 4; row>0; row--) {
            for (int column = row; column>0; column--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

