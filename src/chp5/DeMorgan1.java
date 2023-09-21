package chp5;

public class DeMorgan1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println(!((x <= 8) && (y > 4)));


        int i = 5;
        int j = 3;
        System.out.println(!((i > 4) || (j <= 6)));
    }
}
