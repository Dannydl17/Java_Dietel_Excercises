package chp7;

public class GradeBookTest1 {
    public static void main(String[] args) {
        int[][] gradesArray = {{87, 96, 70},
                               {68, 87, 90},
                               {94, 100, 90},
                               {100, 81, 82},
                               {83, 65, 85},
                               {78, 87, 65},
                               {85, 75, 83},
                               {91, 94, 100},
                               {76, 72, 84},
                               {87, 93, 73}};

        GradeBook1 myGradeBook1 = new GradeBook1(
                "CS101 Introduction to Java Programming", gradesArray);
         System.out.printf("Welcome to the grade book for%n%s%n%n",
                myGradeBook1.getCourseName());
         myGradeBook1.processGrades();

    }
}
