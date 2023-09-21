package AssigmentNdClassWork;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Are you hungry or not: ");
        String answer = keyboardInput.nextLine();

        if(Objects.equals(answer, "yes")){
            System.out.println("Bro Go Buy Food");
        } else if (Objects.equals(answer, "no")) {
            System.out.println("ABEG GETA");
        }
    }
}
