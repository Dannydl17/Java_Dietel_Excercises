//package abdulmaliksassignment.classaveragecalculator;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ClassAverageCalculatorTest {
//
//    /*TODO: WE WILL TEST THAT THE TEACHER CAN INPUT THE GRADES
//        WE WILL ALSO TEST THAT THE OUR APP WILL ADD THE GRADES
//        WE WILL ALSO TEST THAT OUR APP WILL DIVIDE THE GRADES AFTER ADDITION
//        WE WILL ALSO TEST THAT THE APP WILL PRINT THE RESULT*/
//
//
//    @Test void testThatOurTeacherCanInputGrades(){
//
//        ClassAverageCalculator averageCalculator = new ClassAverageCalculator();
//        //Method that input grades
//        int currentGrade = averageCalculator.inputGrades(7);
//        assertEquals(currentGrade, 7);
//    }
//
//    @Test void testThatOurAppWillAddAllTheGrades(){
//        ClassAverageCalculator averageCalculator = new ClassAverageCalculator();
//        int currentGrade = averageCalculator.inputGrades(8);
//        for (int index = 0; index < 5; index++) {
//            averageCalculator.addGrades(currentGrade);
//            currentGrade--;
//        }
//        assertEquals(averageCalculator.getSum(), 30);
//    }
//
//    @Test void testThatOurAppWillDivideTheGradesAfterAddition(){
//        ClassAverageCalculator averageCalculator = new ClassAverageCalculator();
//        for (int index = 0; index < 5; index++) {
//            int currentGrade = averageCalculator.inputGrades(8);
//            averageCalculator.addGrades(currentGrade);
//        }
//        double average = averageCalculator.getAverage();
//        assertEquals(average, 8.0);
//    }
//}