package abdulmaliksassignment.classaveragecalculator;

import javax.swing.*;

public class ClassAverageCalculatorMain {
    private ClassAverageCalculator calculator = new ClassAverageCalculator();
    public void displayWelcome(){
        JOptionPane.showMessageDialog(null, "Welcome");
    }

    public int getNumberOfGradesTeacherWantsToEnter(){
        int size = Integer.parseInt(JOptionPane.showInputDialog("please enter the size of the grades you wish to calculate"));
        return size;
    }

    public void promptTheTeacherToInputTheGradesAndAddTheGrades(){
        int sizeOfGrades = getNumberOfGradesTeacherWantsToEnter();
        for (int index = 1; index <= sizeOfGrades; index++) {
            int currentGrade = Integer.parseInt(JOptionPane.showInputDialog("enter the "+index+"th"+ " grades"));
            int input = calculator.inputGrades(currentGrade);
            calculator.addGrades(input);
        }
        System.out.println(calculator.getSum());
    }

    public void printGradesAverageToTeacher(){
        double average = calculator.getAverage();
        JOptionPane.showMessageDialog(null, "The Average of all the grades is: "+average);
    }

    public static void main(String[] args) {
        ClassAverageCalculatorMain main = new ClassAverageCalculatorMain();
        main.displayWelcome();
        main.promptTheTeacherToInputTheGradesAndAddTheGrades();
        main.printGradesAverageToTeacher();
    }
}
