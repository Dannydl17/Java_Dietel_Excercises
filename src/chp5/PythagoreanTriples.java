package chp5;

public class PythagoreanTriples {
    public static void main(String[] args) {
        int limit = 500;
        System.out.println("Pythagorean Triples (side1, side2, hypotenuse):");
        for (int side1 = 1; side1 <= limit; side1++) {
            for (int side2 = 1; side2 <= limit; side2++) {
                for (int hypotenuse = 1; hypotenuse <= limit; hypotenuse++) {
                    System.out.println(side1 + ", " + side2 + ", " + hypotenuse);
                }
            }
        }
    }
}
