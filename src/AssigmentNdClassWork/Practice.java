package AssigmentNdClassWork;

public class Practice {
    public static void main(String[] args) {
//        for (int counter = 1; counter <=10; counter++) {
//            System.out.printf("%d%n ", counter);
//        }
//        for (int counter = 100; counter>=1; counter--) {
//            System.out.printf("%d ", counter);
//        }
        int total = 0;
        for (int number = 2; number <=20; number+=2) {
            total = total + number;
        }
        System.out.print("The sum is: "+ total);
    }
}
