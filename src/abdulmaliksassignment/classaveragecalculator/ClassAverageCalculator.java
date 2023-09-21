package abdulmaliksassignment.classaveragecalculator;

public class ClassAverageCalculator {
    private double sum;
    private int countOfNumbers;

    public int inputGrades(int grade) {
        countOfNumbers++;
        return grade;
    }

    public void addGrades(int currentGrade) {
        sum =  sum + currentGrade;
    }

    public double getSum() {
        return sum;
    }

    public double getAverage() {
        double average =  sum/countOfNumbers;
        return average;
    }

    public int getCount() {
        return countOfNumbers;
    }

}
