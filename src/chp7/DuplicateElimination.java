package chp7;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;


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
