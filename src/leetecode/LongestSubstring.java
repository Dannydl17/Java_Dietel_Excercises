//package leetecode;
//
//public class LongestSubstring {
//
//    public static String canCountLongest(String letter) {
//         char[] words = letter.toCharArray();
//         char temp;
//         int row = 0;
//         while (row < words.length){
//             int column = row + 1;
//             while (column < words.length){
//                 if (words[column] < words[row]) {
//                     temp = words[row];
//                     words[row] = words[column];
//                     words[column] = temp;
//                 }
//                 column+=1;
//             }
//             row+= 1;
//         }
//        return String.valueOf(words);
//    }
//}
