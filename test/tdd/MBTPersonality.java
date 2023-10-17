package tdd;

import java.util.Scanner;

public class MBTPersonality {
    public static void main(String[] args) {
        String[] letters = {
                "A.expend energy, enjoy groups  B.conserve energy, enjoy one-on-one",
                "A.Interpret literally    B.look for meaning and possibilities",
                "A.logical, thinking, questioning    B.empathetic, feeling, accommodating",
                "A.organized, orderly  B.flexible, adaptable",
                "A.more outgoing, think out loud  B.more reserved, think to yourself",
                "A.practical, realistic, experiential   B.imaginative, innovative, theoretical",
                "A.candid, straight forward, frank  B.tactful, kind, encouraging",
                "A.plan, schedule B.unplanned, spontaneous",
                "A.seek many task, public activities, interaction with others  B.seek private, solitary activities with quiet to concentrate",
                "A.standard, usual, conventional B .different, novel, unique",
                "A.firm, tend to criticize, hold the line  B.gentle, tend to appreciate, conciliate",
                "A.regulated, structured  B.easy-going, live and let live",
                "A.external, communicative, express yourself  B.internal, reticent, keep to yourself",
                "A.focus on here-and-now  B.look to the future, global perspective, big picture",
                "A.tough-minded, just  B.tender-hearted, merciful",
                "A.preparation, plan ahead  B.go with the flow, adapt as you go",
                "A.active, initiate  B.reflective, deliberate",
                "A.facts, things, what is  B.ideas, dreams, what could be, philosophical",
                "A.matter of fact, issue-oriented  B.sensitive, people-oriented, compassionate",
                "A.control, govern  B.latitude, freedom",
        };
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("What is your name:   ");
        String name = keyboardInput.nextLine();
        prompt(name);
//        displayResponses(letters);
        separateResponses(displayResponses(letters));
    }

    public static String prompt(String prompt) {
        return prompt;
    }

    public static String[] displayResponses(String[] letters) {
        String[] result = new String[letters.length];
        Scanner keyboardInput = new Scanner(System.in);
        for (int index = 0; index < letters.length; index ++) {
            System.out.println(letters[index]);
            System.out.println("Enter A or B: ");
            String userInput = keyboardInput.next();
            if (userInput.equals("A") || userInput.equals("B")) {
                result[index]  = userInput +"." + letters[index];
            }
            else {
                System.out.println("I know this is an error, Please retry again");
                index -= 1;
            }
        }
        return result;
    }



    public  static char[] separateResponses(String[] result){
        int count = 0;
        for (int index = 0; index < result.length; index+=4) {
             count++;
        }

        char [] extrovertIntrovert = new char[count];
        int counter = 0;
        for (int index = 0; index < result.length; index+=4) {
            extrovertIntrovert[counter] = result[index].charAt(0);
            counter++;
            System.out.println(extrovertIntrovert[counter]);
        }

        int countA = 0;
        int countB = 0;
        for (int index = 0; index < extrovertIntrovert.length; index++) {
            if (extrovertIntrovert[index] == 'A') {
                System.out.println(extrovertIntrovert);
                countA++;
            }
            if (extrovertIntrovert[index] == 'B') {
                System.out.println(extrovertIntrovert[index]);
                countB++;
            }
        }
        System.out.println(counter);
        System.out.println(countA);
        System.out.println(countB);
        return extrovertIntrovert;
    }
}


