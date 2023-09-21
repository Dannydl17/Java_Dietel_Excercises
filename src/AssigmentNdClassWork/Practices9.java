package AssigmentNdClassWork;

public class Practices9 {
    public static void main(String[] args) {
//       Practices9.swapVariables(2, 4);
       Practices9.swapVariables("john","don");
    }

//    private static void swapVariables(int a, int b) {
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("a is now ==>" + a);
//        System.out.println("b is now ==>" + b);
//    }


    public static void swapVariables(String a, String b){
       String name = a;
        a = b;
        b = name;
        System.out.println("a is now ==>" + a);
        System.out.println("b is now ==>" + b);
    }
}
