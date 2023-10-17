package chp6;

public class FillCharacter {
    public static void main(String[] args) {
        printBox(5);
    }
    public static void printBox(int fillCharacter){
        for (int count = 0; count < fillCharacter; count++) {
            printStars(fillCharacter);
        }
    }

    public static void printStars(int fillCharacter){
        for (int count = 1; count <= fillCharacter; count++) {
            System.out.print("# ");
        }
        System.out.println();
    }
}
