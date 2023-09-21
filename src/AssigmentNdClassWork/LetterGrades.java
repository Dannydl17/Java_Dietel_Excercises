package AssigmentNdClassWork;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        int fCounter = 0;

        Scanner keyboardInput = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (keyboardInput.hasNext());{
            int grade = keyboardInput.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade / 10){
                case 9:
                case 10:
                  ++aCounter;
                  break;
                case 8:
                    ++bCounter;
                    break;
                case 7:
                    ++cCounter;
                    break;
                case 6:
                    ++dCounter;
                    break;
                default:
                    ++fCounter;
                    break;
            }
        }

        System.out.printf("%nGrade Report:%n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCounter,
                    "B: ", bCounter,
                    "C: ", cCounter,
                    "D: ", dCounter,
                    "F: ", fCounter);
        }
        else {
            System.out.println("No grades were entered");
        }
    }
    }

