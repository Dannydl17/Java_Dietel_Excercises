package AssigmentNdClassWork;

public class Practices7 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 11 - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 11 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");


        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 11 - i; k++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
