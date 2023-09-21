package AssigmentNdClassWork;

public class functionCall {
    public static void main(String[] args) {
        printBox(5);
    }
    public static void printBox(int numberOfStar){
        for (int count = 0; count < numberOfStar; count++) {
           printStars(numberOfStar);
        }
    }

    public static void printStars(int numberOfStar){
        for (int count = 1; count <= numberOfStar; count++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
