package chp6;

public class Multiples {

    public static boolean isMultiplesOf(int firstNumber, int secondNumber){
        while (secondNumber > 0) {
            if (secondNumber % firstNumber ==0) {
                return true;
            }
        }
       return false;
    }
}
