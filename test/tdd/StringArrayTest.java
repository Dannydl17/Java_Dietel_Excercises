package tdd;

import org.junit.jupiter.api.Test;
import task.StringArray;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringArrayTest {
    @Test
    public void testThatStringArrayCanReturnANumber(){
        String[] given = {"ABC21F", "13C10PZ", "A1L"};
        int actual = StringArray.canRemoveDigit(given);
        assertEquals(7,actual);
    }
}
