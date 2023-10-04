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

    public String resultSummaryOfPeoplePassed(int score) {
        int total = 0;
        int pass = 0;
        for (int counter =0; counter<=10; counter++) {
            total += score;
        }
        if (total >= 50) {
            pass = pass + 1;
        }
        String newPass = String.valueOf(pass);
        return newPass;
    }

    public String resultSummaryOfPeopleFailed(int score) {
        int total = 0;
        int fail = 0;
        for (int counter =0; counter<=10; counter++) {
            total += score;
        }
        if (total < 50) {
            fail = fail + 1;
        }
        String newFail = String.valueOf(fail);
        return newFail;
    }

}
