package tdd;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        int tempo = 0;
        while (number > 0){
              int remainder = number % 10;
            number /=10;

            tempo = tempo * 10 + remainder;
            System.out.println(tempo);
        }
        return tempo;
    }

    public static int reverseNumber1(int number){
        int tempo = 0;
        while (number != 0){
            int remainder = number % 10;
            number /=10;
            if(tempo > Integer.MAX_VALUE/10|| tempo < Integer.MIN_VALUE/10){
                return 0;
            }
            tempo = (tempo*10) + remainder;
        }
        return tempo;
    }

}
