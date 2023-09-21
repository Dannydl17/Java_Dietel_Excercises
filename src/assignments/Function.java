package assignments;

public class Function {
    public static boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPalindrome(int numbers) {
        int originalNumber;
        originalNumber = numbers;

        numbers = originalNumber;
        int reversedNumber = 0;

        while (numbers != 0){
            int remainder = numbers % 10;
            reversedNumber = (reversedNumber * 10)+ remainder;
            numbers = numbers / 10;
        }
        if (originalNumber == reversedNumber) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrimeNumber(int number){
        int count = 0;
        for(int counter=1;counter<=number;counter++)
        {
            if(number%counter==0)
            {
                count++;

            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }

    }

    public static int factorOf(int number){
        int counter = 0;
        for (int count = 1; count <= number; count++) {
            if (number % count ==0) {
                counter++;
            }
        }
        return counter;
    }

    public static int factorialOf(int number) {
        int factorial = 1;

        for (int counter = 0; counter < number; counter++) {
            factorial = factorial * (number - counter);
        }
        return factorial;
    }

    public static boolean isSquare(int numbers){

        for (int number = 2; number<=numbers; number++) {
            if (number * number == numbers) {
                return true;
            }

        }
        return false;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (firstNumber < secondNumber) {
            result = secondNumber - firstNumber;
        }
        else {
            result = firstNumber - secondNumber;
        }
        return result;
    }
}
