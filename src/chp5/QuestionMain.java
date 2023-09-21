package chp5;

import java.util.Scanner;

public class QuestionMain {
    public static void main(String[] args) {
        String q1 = "The environmental cause of skin cancer, cataract and mutation is \n"
                +"(a)Acid rain\n (b)Global warning\n (c)Nuclear winter\n (d)Ozone depletion\n";

        String q2 = "Global warming is a consequence of \n"
                +"(a)Acid rain\n (b)Green house effect\n (c)depletion on the ozone layer\n (d)radioactive fall out\n";

        String q3 = "The climate of a place is not determined by \n"
                +"(a)Latitude\n (b)Altitude\n (c)Longitude\n (d)Distance from sea\n";

        String q4 = "Which gas was absent in the atmosphere when the earth was formed \n"
                +"(a)Methane\n (b)Hydrogen\n (c)Oxygen\n (d)Ammonia\n";

        String q5 = "identify - which of the following is not a green house gas? \n"
                +"(a)Chlorine\n (b)Methane\n (c)Water vapour\n (d)Carbon-dioxide\n";

        Question [] questions = {
                new Question(q1, "d"),
                new Question(q2, "d"),
                new Question(q3, "c"),
                new Question(q4, "c"),
                new Question(q5, "a"),
        };
        takeTest(questions);
    }

    public static void takeTest(Question [] questions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int row = 0; row < questions.length; row++) {
            System.out.println(questions[row].prompt);
            System.out.print("Enter your answer: ");
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[row].answer)){
                score++;
            }
            if (score == 5) {
                System.out.println("Excellent");
            } else if (score == 4) {
                System.out.println("Very good");
            }
            else {
                System.out.println("Time to brush up on your knowledge of global warming");
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }
}
