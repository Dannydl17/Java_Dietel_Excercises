package leetecode;

import java.util.Arrays;

public class Parentheses {

    public static Boolean canReturnTheCorrectParentheses(String elements) {
        boolean string = false;
        for (int count = 0; count < elements.length(); count++) {
            String newString = String.valueOf(elements.charAt(count));
            for (int innerCount = count; innerCount <elements.length(); innerCount++) {
                String nums = String.valueOf(elements.charAt(innerCount));

                if (newString.equals(nums)) {
                    string = true;
                }
                else{
                    string = false;
                }
            }
        }
        return string;
    }
}
