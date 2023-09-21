package abdulmaliksassignment.classaveragecalculator;

import abdulmaliksassignment.classCalculator1.ClassCalculator1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassCalculatorTest1 {
    /*TODO: WE WILL TEST THAT THE TEACHER CAN INPUT THE GRADES
        WE WILL ALSO TEST THAT THE OUR APP WILL ADD THE GRADES
        WE WILL ALSO TEST THAT OUR APP WILL DIVIDE THE GRADES AFTER ADDITION
        WE WILL ALSO TEST THAT THE APP WILL PRINT THE RESULT*/

    @Test
     public void testThatTeacherCanInputGrade(){
        ClassCalculator1 classCalculator1 = new ClassCalculator1();
        int numberOfGrade = classCalculator1.collectGrade(20);
        assertEquals(20, numberOfGrade);
    }

    @Test
    public void testThatClassCalculatorCanAddTheUnknownGrade(){
        ClassCalculator1 classCalculator1 = new ClassCalculator1();
        int numberOfGrade = classCalculator1.collectGrade(10);
        while (numberOfGrade != -1){
            if (numberOfGrade >= 0) {
              classCalculator1.addGrade(numberOfGrade);
              numberOfGrade--;
            }
        }
        assertEquals(55.0, classCalculator1.getSum());
    }

    @Test void testThatOurAppWillDivideTheGradesAfterAddition(){
        ClassCalculator1 classCalculator1 = new ClassCalculator1();
        int numberOfGrade = classCalculator1.collectGrade(4);
        while (numberOfGrade != -1){
            if (numberOfGrade >= 0) {
                classCalculator1.addGrade(numberOfGrade);
                numberOfGrade--;
            }
        }
        double average = classCalculator1.getAverage();
        assertEquals(10.0, average);
    }
}
