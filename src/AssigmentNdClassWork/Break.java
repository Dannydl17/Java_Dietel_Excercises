package AssigmentNdClassWork;

public class Break {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <=10; count++) {
            if (count == 6) {
                break;
            }
            System.out.printf("%d", count);
        }
        System.out.printf("%nBroke out of loop at = %d%n", count);
    }
}
