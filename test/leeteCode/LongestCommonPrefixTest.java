package leeteCode;

import leetecode.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testThatLongestCommonPrefixCanBeCounted(){
        String[] letters = {"dog","racecar","car"};
        String name = LongestCommonPrefix.canCountLongCommonPrefix(letters);
        String expected = "";
        assertEquals(expected, name);
    }

    @Test
    public void testThatLongestCommonPrefixCanBeCountedTwice(){
        String[] letters = {"flower","flow","flight"};
        String name = LongestCommonPrefix.canCountLongCommonPrefix(letters);
        String expected = "fl";
        assertEquals(expected, name);
    }
}
