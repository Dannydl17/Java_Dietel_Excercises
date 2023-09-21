package AssigmentNdClassWork;

public class Divide {
    public static void main(String[] args) {

    }

    public static double divide(int firstNumber, int secondNumber){
        if (secondNumber != 0) {
            double result = (double) firstNumber / secondNumber;
            return Math.round(result * 100.0) / 100.0;

        }
        else {
            return 0;
        }
    }

}
