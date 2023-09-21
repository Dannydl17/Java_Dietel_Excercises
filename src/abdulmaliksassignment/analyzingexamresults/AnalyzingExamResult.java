package abdulmaliksassignment.analyzingexamresults;

public class AnalyzingExamResult {

    public String firstName(String firstName) {
        return firstName;
    }

    public String collectName(String name) {
        return name;
    }

    public int collectTestScore(int testScore) {
        return testScore;
    }

    public int countTestScore(int score) {
        int total = 0;
        total+=score;
        return total;
    }

    public int resultSummary(int score) {
        int total = 0;
        total+=score;

        int pass = 0;
        int fail = 0;

        if (total >= 50) {
            pass++;
        }
        if (total < 50) {
            fail++;
        }
       String newValue = String.valueOf(pass);
        String newValue1 = String.valueOf(fail);
        return Integer.parseInt(newValue + newValue1);
    }
}
