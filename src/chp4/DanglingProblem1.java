package chp4;

public class DanglingProblem1 {
    public static void main(String[] args) {
        int y = 7;
        int x = 5;
        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        }
        else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }

    }
}
