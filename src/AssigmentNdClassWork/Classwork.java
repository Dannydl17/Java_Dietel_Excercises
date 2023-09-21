package AssigmentNdClassWork;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        int x = 4;
        int n = 5;
        int result = 1;

        for (int number= 1; number<=n; number++){
            result *= x;
        }
        System.out.println(result);
    }
}
