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
        int testScore = analyzingExamResult.collectTestScore(20);
        int total = 0;
        for (int count = 1; count <= 10; count++) {
            total = analyzingExamResult.countTestScore(testScore);
        }
        assertEquals(20, total);
    }

    @Test
    public void testThatAnalyzingExamResultCanDisplayTheNumberOfStudentResultTest() {
        AnalyzingExamResult analyzingExamResult = new AnalyzingExamResult();
        int testScore = analyzingExamResult.collectTestScore(20);
        int total = 0;
        int answer = 0;
        for (int count = 1; count <= 10; count++) {
            total = analyzingExamResult.countTestScore(testScore);
            answer = analyzingExamResult.resultSummary(total);
        }
        assertEquals(20, total);
    }





}
