package tdd;

import org.junit.jupiter.api.Test;
import task2.TargetNumber;

public class TargetNumberTest {

    @Test
    public void testThatTargetNumberCanReturnABooleanExpressionTest(){
        int num = 13579;
        int index1 = 1;
        int index2 = 2;
        int targetNumber = 4;

        boolean result = TargetNumber.isBooleanExpression(num, index1, index2, targetNumber);

    }
}
