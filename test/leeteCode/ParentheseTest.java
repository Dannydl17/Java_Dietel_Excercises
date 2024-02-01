package leeteCode;

import leetecode.Parentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTest {

    @Test
    public void testThatParenthesesCanBeEqualTest(){
        String parentheses = "()[]{}";
        Boolean actual = Parentheses.canReturnTheCorrectParentheses(parentheses);
        assertFalse(actual);
    }
}