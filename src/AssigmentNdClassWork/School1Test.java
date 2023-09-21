package AssigmentNdClassWork;

import java.util.Scanner;

public class School1Test {
    public static void main(String[] args) {
        School1 school1 = new School1();
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter school name: ");
        String name = keyboardInput.nextLine();
        school1.setSchoolName(name);

        System.out.print("Enter school location: ");
        String location = keyboardInput.nextLine();
        school1.setLocation(location);


        System.out.print("Enter number of student: ");
        int numbers = keyboardInput.nextInt();
        school1.setNumberOfStudent(numbers);

        System.out.println("Name of the School: " + school1.getSchoolName());
        System.out.println("Location: " + school1.getLocation());
        System.out.println("Number of Student: " + school1.getNumberOfStudent());

    }
}
