package chp4;

public class Dangling {
    public static void main(String[] args) {
         int x = 9;
         int y = 7;
        if (x > 5) {
            if (y > 5) {
                System.out.println("x and y are > 5");
            }
            else {
                System.out.println("x is <= 5");
            }
        }
    }
}
