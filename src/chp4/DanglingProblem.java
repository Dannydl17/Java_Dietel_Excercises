package chp4;

public class DanglingProblem {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            }
            else{
                System.out.println("#####");
                System.out.println("$$$$$");
                }
            }
        }
    }
