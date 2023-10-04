//package task;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ArrayTest {
//        @Test
//        public void testThatAnArrayCanReturnTheLargestNumberTest(){
//            int[] actual = {4,6,8,90,45,4};
//            int actuals = Array.largeNumber(actual);
//            int expected = 90;
//            assertEquals(actuals,expected);
//        }
//
//
//    @Test
//        public void testThatAnArrayCanBeReverseTest(){
//            int[] given = {1,2,3,4,5,6,7,8};
//            int[] actuals = Array.reverseNumber(given);
//            int[] expected = {8,7,6,5,4,3,2,1};
//            assertArrayEquals(expected, actuals);
//        }
//
//        @Test
//        public void testThatArrayCanHaveEvenNumberTest(){
//            int[] given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int[] actual = Array.evenNumber(given);
//            int[] expected = {2, 4, 6, 8, 10};
//            assertArrayEquals(expected, actual);
//        }
//
//        @Test
//        public void testThatArrayCanHaveOddNumberTest(){
//            int[] given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int[] actual = Array.oddNumber(given);
//            int[] expected = {1, 3, 5, 7, 9};
//            assertArrayEquals(expected, actual);
//        }
//
//        @Test
//        public void testThatArrayCanHaveCheckOnExistingElementTest(){
//            int[] given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            boolean expected = Array.checkElement(given);
//            assertTrue(expected);
//        }
//
//        @Test
//        public void testThatArrayCanCalculateTheRunningTotalTest(){
//            int[] given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int actual = Array.runningTotal(given);
//            int expected = 55;
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testThatArrayCanCalculateTheSumTest() {
//            int[] given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//            int actual = Array.sum(given);
//            int expected = 66;
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testThatArrayCanCalculateTheSum1Test() {
//            int[] given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//            int actual = Array.sum1(given);
//            int expected =78;
//            assertEquals(expected, actual);
//        }
//
//        @Test
//        public void testThatArrayCanCalculateTheSum2Test() {
//            int[] given = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//            int actual = Array.sum2(given);
//            int expected = 78;
//            assertEquals(expected, actual);
//        }
//
//
//        @Test
//        public void testThatArrayCanCheckThatAStringIsAPalindromeTest() {
//            String[] given = {"Dan"};
//            boolean expected = Array.isPalindrome(given);
//            assertTrue(expected);
//        }
//
//        @Test
//        public void testThatTwoLIstCanBeConcatenatedTest(){
//            char[] givenFirstList = {'a','b','c'};
//            int[] givenSecondList = {1,2,3};
//            char[] actuals = Array.concatenateList(givenFirstList, givenSecondList);
//            char[] expected = {'a','b','c',1,2,3};
//            assertEquals(expected, actuals);
//        }
//}
