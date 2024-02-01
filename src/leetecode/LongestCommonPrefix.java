package leetecode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String canCountLongCommonPrefix(String[] letters) {
        String results = "";
        int word = letters.length;
        for (int index = 0; index < word - 1; index++) {
                 for (int innerColumn = index; innerColumn < letters.length; innerColumn++) {
                        if (letters[index].compareTo(letters[innerColumn]) > 0) {
                            String temp = letters[index];
                            letters[index] = letters[innerColumn];
                              letters[innerColumn] = temp;
                        }
                 }
        }
        System.out.println(Arrays.toString(letters));
        char[] first = letters[0].toCharArray();
        char[] last = letters[letters.length - 1].toCharArray();
        for (int index = 0; index < first.length; index++) {
            if (first[index] != last[index]) {
                break;
            }
            results+=first[index];
        }
        return results;
    }

    public static String longestCommonPrefix(String[] letters) {
        if (letters == null || letters.length == 0) return "";
        String prefix = letters[0];
        for (String s : letters)
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }
}

