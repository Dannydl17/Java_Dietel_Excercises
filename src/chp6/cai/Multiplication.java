package chp6.cai;

import java.security.SecureRandom;

public class Multiplication {

    private int integer1;
    private int integer2;
    private int multiplicationResult;

    private int positiveInteger(){
        SecureRandom randomNumberGenerator = new SecureRandom();
        return randomNumberGenerator.nextInt(21);
    }

    public void multiplyIntegers() {
        integer1 = positiveInteger();
        integer2 = positiveInteger();
        multiplicationResult = integer1 * integer2;
    }

    public int getMultiplicationResult(){
        return multiplicationResult;
    }


}
