package abdulmaliksassignment.classCalculator1;

public class ClassCalculator1 {
     private int sum;
     private int count;
    public int collectGrade(int numberOfGrade) {
        count++;
        return numberOfGrade;
    }

    public void addGrade(int numberOfGrade) {
        sum = sum + numberOfGrade;
    }

    public double getSum() {
        return sum;
    }

    public double getAverage() {
        double average = sum / count;
        return average;
    }
    public int getCount(){

        return count;
    }

}
