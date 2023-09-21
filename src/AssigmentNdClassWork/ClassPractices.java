package AssigmentNdClassWork;

public class ClassPractices {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

         int number = firstNumber;
         firstNumber = secondNumber;
         secondNumber = thirdNumber;
         thirdNumber = number;

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

    }
}
