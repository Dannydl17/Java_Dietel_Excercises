package AssigmentNdClassWork;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 0;

        for (number = 1; number <=100; number++) {
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("fizzbuzz");
            }
            else if (number % 3 == 0) {
                System.out.println("fizz");
            }
            else if (number % 5 == 0) {
                System.out.println("buzz");
            }
            else System.out.println(number);
        }
    }
}
