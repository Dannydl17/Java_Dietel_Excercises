package chp6;

public class RoundNumber {
    public static void main(String[] args) {
       double result =  roundToInteger(1.4);
       double resultNum =  roundToTenth(10.4);
       double resultNum2 =  roundToHundredths(100.4);
       double resultNum3 =  roundToThousandth(1000.4);

        System.out.println(result);
        System.out.println(resultNum);
        System.out.println(resultNum2);
        System.out.println(resultNum3);

    }
    public static double roundToInteger(double number){
        double numbers = Math.floor(number * 10 + 0.5);
        return numbers;
    }
    public static double roundToTenth(double number){
        double num= Math.floor(number * 10 + 0.5) /10;
        return num;
    }
    public static double roundToHundredths(double number){
        double num = Math.floor(number * 100 + 0.5) /100;
        return num;
    }
    public static double roundToThousandth(double number){
        double num = Math.floor(number * 1000 + 0.5) /1000;
        return num;
    }
}
