package tdd;

import java.util.Arrays;
import java.util.Scanner;

public class MBTPersonality {
    public static void main(String[] args) {
        String[][] letters = {
                {"A.expend energy, enjoy groups"}, {"B.conserve energy, enjoy one-on-one"},
                {"A.Interpret literally"},     {"B.look for meaning and possibilities"},
                {"A.logical, thinking, questioning"}, {"B.empathetic, feeling, accommodating"},
                {"A.organized, orderly"}, {"B.flexible, adaptable"},
                {"A.more outgoing, think out loud"}, {"B.more reserved, think to yourself"},
                {"A.practical, realistic, experiential"}, {"B.imaginative, innovative, theoretical"},
                {"A.candid, straight forward, frank"}, {"B.tactful, kind, encouraging"},
                {"A.plan, schedule"}, {"B.unplanned, spontaneous"},
                {"A.seek many task, public activities, interaction with others"}, {"B.seek private, solitary activities with quiet to concentrate"},
                {"A.standard, usual, conventional"}, {"B .different, novel, unique"},
                {"A.firm, tend to criticize, hold the line"}, {"B.gentle, tend to appreciate, conciliate"},
                {"A.regulated, structured"}, {"B.easy-going, live and let live"},
                {"A.external, communicative, express yourself"}, {"B.internal, reticent, keep to yourself"},
                {"A.focus on here-and-now"}, {"B.look to the future, global perspective, big picture"},
                {"A.tough-minded, just"}, {"B.tender-hearted, merciful"},
                {"A.preparation, plan ahead"}, {"B.go with the flow, adapt as you go"},
                {"A.active, initiate"}, {"B.reflective, deliberate"},
                {"A.facts, things, what is"}, {"B.ideas, dreams, what could be, philosophical"},
                {"A.matter of fact, issue-oriented"}, {"B.sensitive, people-oriented, compassionate"},
                {"A.control, govern"}, {"B.latitude, freedom"},
        };

        Scanner keyboardInput = new Scanner(System.in);
//        System.out.println("What is your name:   ");
//        String name = keyboardInput.nextLine();
//        prompt(name);
        displayResponses(letters);
    }

    public static String prompt(String prompt) {
        return prompt;
    }

    public static void displayResponses(String[][] letters) {
        String[] result = new String[letters.length / 2];
        Scanner keyboardInput = new Scanner(System.in);
        int count = 0;
        for (int index = 0; index < letters.length; index++) {
            for (int column = 0; column < letters[index].length; column++) {
                System.out.println(letters[index][column] + " " + letters[index + 1][column]);
                System.out.println("Enter A or B: ");
                String userInput = keyboardInput.next();
                while (!userInput.equals("A") && !userInput.equals("B")) {
                    System.out.println("I know this is an error, Please retry again");
                    System.out.println(letters[index][column] + " " + letters[index + 1][column]);
                    System.out.println("Enter A or B: ");
                    userInput = keyboardInput.next();
                }
                if (userInput.equals("A")) {
                    result[count] = userInput + " " + letters[index][column];
                    count++;
                }
                if (userInput.equals("B")) {
                    result[count] = userInput + " " + letters[index + 1][column];
                    count++;
                }
                index += 1;

            }
        }
        System.out.println(Arrays.toString(result));
        separateResponses(result);
    }


    public  static void separateResponses(String[] result){
        int count = 0;
        for (int index = 0; index < result.length; index+=4) {
             count++;
        }

        String [] extrovertIntrovert = new String[count];
        int counter = 0;
        for (int index = 0; index < result.length; index+=4) {
            extrovertIntrovert[counter] = result[index];
            counter++;
        }

        int numberEA = 0;
        int numberEB = 0;
        int countE = 0;
        for (int index = 0; index < extrovertIntrovert.length; index++) {
            System.out.println(extrovertIntrovert[index]);
            String response = extrovertIntrovert[index];
            if (response.startsWith("A")){
                numberEA++;
            }
            if (response.startsWith("B")) {
                numberEB++;
            }
            countE++;
        }
        System.out.println("Number of A: is " + numberEA);
        System.out.println("Number of B: is " + numberEB);


        String[] sensingSIntuitiveN = new String[count];
        int   countNum = 0;
        for (int index = 1; index < result.length; index+=4) {
          sensingSIntuitiveN[countNum] = result[index];
          countNum++;
        }
        int numberSA = 0;
        int numberSB = 0;
        int countS = 0;
        for (int index = 0; index < sensingSIntuitiveN.length; index++) {
            System.out.println(sensingSIntuitiveN[index]);
            String response = sensingSIntuitiveN[index];
            if (response.startsWith("A")){
                numberSA++;
            }
            if (response.startsWith("B")) {
                numberSB++;
            }
            countS++;
        }
        System.out.println("Number of A: is " + numberSA);
        System.out.println("Number of B: is " + numberSB);

        String[] thinkingTFeelingN = new String[count];
        int countNum1 = 0;
        for (int index = 2; index < result.length; index+=4) {
            thinkingTFeelingN[countNum1] = result[index];
            countNum1++;
        }
        int numberTA = 0;
        int numberTB = 0;
        int countT = 0;
        for (int index = 0; index < thinkingTFeelingN.length; index++) {
            System.out.println(thinkingTFeelingN[index]);
            String response = thinkingTFeelingN[index];
            if (response.startsWith("A")){
                numberTA++;
            }
            if (response.startsWith("B")) {
                numberTB++;
            }
            countT++;
        }
        System.out.println("Number of A: is " + numberTA);
        System.out.println("Number of B: is " + numberTB);

        String[] judgingJPerceptiveP = new String[count];
        int countNum2 = 0;
        for (int index = 3; index < result.length; index+=4) {
            judgingJPerceptiveP[countNum2] = result[index];
            countNum2++;
        }
        int numberJA = 0;
        int numberJB = 0;
        int countJ = 0;
        for (int index = 0; index < judgingJPerceptiveP.length; index++) {
            System.out.println(judgingJPerceptiveP[index]);
            String response = judgingJPerceptiveP[index];
            if (response.startsWith("A")){
                numberJA++;
            }
            if (response.startsWith("B")) {
                numberJB++;
            }
            countJ++;
        }
        System.out.println("Number of A: is " + numberJA);
        System.out.println("Number of B: is " + numberJB);
    }
}


