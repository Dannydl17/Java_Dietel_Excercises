package leetecode;

public class PalindromicSubstring {
    public static void main(String[] args) {
        canLongestString("word");
    }
    public static String canLongestString(String word) {
        for (int index = 0; index < word.length(); index++) {
            for (int innerIndex = index + 1; innerIndex < word.length(); innerIndex++) {
                System.out.println(word);
            }
        }
        return word;
    }
      
}
