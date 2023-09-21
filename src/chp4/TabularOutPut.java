package chp4;

public class TabularOutPut {
    public static void main(String[] args) {
       displayTabularOutput();
    }
    public static void displayTabularOutput(){
        System.out.printf("%s      %s     %s    %s%n",    "N","N2","N3","N4");

        int numbers = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        for (int number = 1; number <= 5; number++) {
            numbers = number;
            firstNumber = number * number;
            secondNumber = number * number * number;
            thirdNumber = number * number * number*number;
            System.out.format("%d      %d       %d     %d%n",numbers,firstNumber,secondNumber,thirdNumber);
        }
    }
}
