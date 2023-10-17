package chp6;

public class primeNumber {
    public static boolean isPrimeNumber(int number){
        int count = 0;
        for(int counter=1;counter<=number;counter++) {
            if(number%counter==0) {
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
}
