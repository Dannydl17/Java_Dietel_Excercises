package chp4;

public class WorldPopulation {
    public static void main(String[] args) {
        long worldPopulation = 8_000_000_000L;
        double growthRate =9;

        System.out.println("YEAR     ANTICIPATED-P       NUMERICAL-INCREASE");
        for (int year = 1; year <= 75; year++) {
            long numericalIncrease = (long) (growthRate / 100 * worldPopulation);
            worldPopulation = worldPopulation + numericalIncrease;
            System.out.println( year + "         " +       worldPopulation +"              " +  numericalIncrease);
        }
    }
}
