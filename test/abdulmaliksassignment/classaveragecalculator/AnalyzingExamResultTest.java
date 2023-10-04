package abdulmaliksassignment.classaveragecalculator;

import abdulmaliksassignment.analyzingexamresults.AnalyzingExamResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnalyzingExamResultTest {

    @Test
    public void testThatAnalyzingExamResultCanCollectFirstNameTest(){
        AnalyzingExamResult analyzingExamResult = new AnalyzingExamResult();
        String name = analyzingExamResult.firstName("Danny");
        assertEquals("Danny", name);
    }


    @Test
    public void testThatAnalyzingExamResultCanCollectTenNamesTest(){
        AnalyzingExamResult analyzingExamResult = new AnalyzingExamResult();
        String name = analyzingExamResult.firstName("Danny");
        for (int student = 1; student <=10 ; student++) {
            analyzingExamResult.collectName(name);
        }
        assertEquals("Danny", name);
    }

    @Test
    public void testThatAnalyzingExamResultCanInputTestResultTest(){
        AnalyzingExamResult analyzingExamResult = new AnalyzingExamResult();
        int testScore = analyzingExamResult.collectTestScore(20);
        assertEquals(20, testScore);
    }

    @Test
    public void testThatAnalyzingExamResultCanCountTheNumberScoreEnteredTest() {
        AnalyzingExamResult analyzingExamResult = new AnalyzingExamResult();
        int testScore = analyzingExamResult.collectTestScore(50);
        for (int count = 1; count <= 10; count++) {
            analyzingExamResult.countTestScore(testScore);
            testScore++;
        }
        assertEquals(60,testScore);
    }

    @Test
    public void testThatAnalyzingExamResultCanDisplayTheNumberOfStudentResultWhoPassedTest() {
        AnalyzingExamResult analyzingExamResult = new AnalyzingExamResult();
        int testScore = analyzingExamResult.collectTestScore(70);
        int answer = Integer.parseInt(String.valueOf(analyzingExamResult.resultSummaryOfPeoplePassed(testScore)));
        assertEquals(1, answer);
       }

    @Test
    public void testThatAnalyzingExamResultCanDisplayTheNumberOfStudentResultWhoFailedTest() {
        AnalyzingExamResult analyzingExamResult = new AnalyzingExamResult();
        int testScore = analyzingExamResult.collectTestScore(40);
        int answer = Integer.parseInt(String.valueOf(analyzingExamResult.resultSummaryOfPeopleFailed(testScore)));
        assertEquals(1, answer);
    }





}
