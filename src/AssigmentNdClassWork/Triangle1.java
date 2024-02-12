package AssigmentNdClassWork;

public class Triangle1 {
    public static void main(String[] args) {
        for (int row =0; row<5; row++) {
            for (int column = 0; column <=row; column++) {
                System.out.print("*" + " ");
            }
            for (int column = 0; column < row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
