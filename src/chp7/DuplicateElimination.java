package chp7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

/*
TODO: 12/26/2023
   1.) Create An Array That Has of length 10 with -1 as the default value in each cell
   2.) Collect 10 integer values that is between 10 and 100 from the user
   3.) Assign The 10 integer values collected from the user into the array
   4.) Start Eliminating The Duplicates
FIXME: 12/26/2023 : How Do We Eliminates The Duplicates

*/
public class DuplicateElimination {
     Scanner scanner = new Scanner(in);
    int[] integers = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public void collectIntegersFromUsersAndAssignToArray(){
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter number between 10 to 100:     ");
            int num = scanner.nextInt();
            if (num >= 10 && num <= 100) {
                integers[index] = num;
            }
        }
    }

    public void eliminateDuplicate(){
        for (int index = 0; index < 10; index++) {
            for (int indexj = index+1; indexj < 10; indexj++) {
                if (integers[index] == integers[indexj])
                    integers[indexj] = -1;
            }
        }
    }

    public int countTheNumberThatAreNotTheDefaultNumber(){
        int count = 0;
        for (int row = 0; row < integers.length; row++) {
            if (integers[row] != -1) {
                count++;
            }
        }
        return count;
    }

    public int[] storeTheRemainingNumber(){
        int count = countTheNumberThatAreNotTheDefaultNumber();
        int[] num = new int[count];
        int newCount = 0;
        for (int counter = 0; counter < integers.length; counter++) {
            if (integers[counter] != -1) {
                num[newCount] = integers[counter];
                newCount++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        DuplicateElimination eliminator = new DuplicateElimination();
        eliminator.collectIntegersFromUsersAndAssignToArray();
        eliminator.eliminateDuplicate();
        System.out.println(Arrays.toString(eliminator.storeTheRemainingNumber()));
    }
}
