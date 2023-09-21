package chp5;

public class Calculate {
     private  double pi;
        public double calculateNumberOfTerm(int number){

        int odd = 1;
         pi = 0.0;

        for (int numbers = 1; numbers <= number; numbers++) {
            double currentTerm = 0.0;
            if (numbers % 2 == 0) {
                currentTerm =(double) -4 / odd;
            }
            else {
                currentTerm = (double) 4/odd;
            }
            odd = odd + 2;
            pi = pi + currentTerm;
        }
        System.out.println(pi);
            return Double.parseDouble(String.valueOf(pi));
        }
}
