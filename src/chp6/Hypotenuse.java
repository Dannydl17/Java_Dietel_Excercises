package chp6;

public class Hypotenuse {
    public static int collectInput(int numbers) {
        return numbers;
    }

    public static int powersFirstNumber(double firstNumber, double secondNumber) {
        double total = Math.pow(firstNumber, secondNumber);
        return (int) total;
    }

    public static int squareNumber(int squareNumber) {
        int number = (int) Math.sqrt(squareNumber);
        return number;
    }
}
