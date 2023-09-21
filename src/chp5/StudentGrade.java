package chp5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int numberOfStudent = 0;
        int countOfStudentA = 0;
        int countOfStudentB = 0;
        int countOfStudentC = 0;
        int countOfStudentD = 0;
        int countOfStudentE = 0;
        int studentGrade = 0;

        while (studentGrade <= 5){

               System.out.println("Enter the name of the student: ");
               String name = keyboardInput.nextLine();

               System.out.println("Enter student letter grade: ");
               char letterGrade = keyboardInput.next().charAt(0);

            switch (letterGrade){
                case 'A':
                    ++countOfStudentA;
                    break;
                case 'B':
                    ++countOfStudentB;
                    break;
                case 'C':
                    ++countOfStudentC;
                    break;
                case 'D':
                    ++countOfStudentD;
                    break;
                case 'E':
                    ++countOfStudentE;
                    break;
            }
            System.out.println("Name Of Student:  " + name + " : " + countOfStudentA + countOfStudentB + countOfStudentC + countOfStudentD + countOfStudentE);
        }
        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "Number of students who received each grade:",
                "A: ", countOfStudentA,
                "B: ", countOfStudentB,
                "C: ", countOfStudentC,
                "D: ", countOfStudentD,
                "E: ", countOfStudentE);
    }
}
