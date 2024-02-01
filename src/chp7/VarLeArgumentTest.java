package chp7;

public class VarLeArgumentTest {

    public static double average(double... numbers){
        double total = 0.0;

        for (double num: numbers) {
            total+=num;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 20.0;
        double num3 = 30.0;
        double num4 = 40.0;

        System.out.printf("num1 = %.1f%n num2 = %.1f%n num3 = %.1f%n num4 = %.1f%n%n",
        num1, num2, num3, num4);

        System.out.printf("Average of num1 and num2 is %.1f%n",average(num1, num2));
        System.out.printf("Average of num1, num2 and num3 is %.1f%n", average(num1, num2, num3));
        System.out.printf("Average of num1, num2, num3 and num4 is %.1f%n", average(num1, num2, num3, num4));

    }
}
