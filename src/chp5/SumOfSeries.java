package chp5;

public class SumOfSeries {

    public long calculateSumOfSeries(int number){
        System.out.printf("%s             %s%n",  "N", "Sum");
        long total = 0;

        for (int counter=1; counter <= number; counter++) {
            total += counter;
            System.out.printf("%d             %d%n",  counter,  total);
        }
        System.out.println(" ");
        return total;
    }

}
