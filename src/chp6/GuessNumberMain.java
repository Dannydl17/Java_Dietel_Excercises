package chp6;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class GuessNumberMain {
    private static Scanner scanner = new Scanner(in);
    public static void displayWelcome(){
        System.out.println("Welcome!!");
    }

    public static String getUserName(){
        System.out.println("please kindly enter your name!!! ");
        return scanner.nextLine();
    }

    public  static void promptUserToStartGameOrEndApplication(){
        String username = getUserName();
        System.out.println("""
                Hey""" + username + """
                please select a choice below:
                1.)Start Game
                2.) Continue
                3.) End Application
                """);
        String userInput = scanner.nextLine();

        switch (parseInt(userInput)){
            case 1 -> startGame();
            case 2 -> continueGame();
            case 3 -> System.exit(0);
        }
    }

    private static void startGame() {
        GuessNumbers.playGame();
    }

    private static void continueGame(){
        boolean ans = true;
        while (ans) {
            System.out.println("Did you still want to continue");
            int input = scanner.nextInt();
            if (input == 1) {
                GuessNumbers.playGame();
            }else ans = false;
        }
    }

    private static void endGame(){
        boolean ans = true;
        while (ans) {
            System.out.println("Did you still want to continue");
            int input = scanner.nextInt();
            if (input == 0) {
                GuessNumbers.playGame();
                ans = false;
            }
        }
    }

    public static void main(String[] args) {
        displayWelcome();
        promptUserToStartGameOrEndApplication();
        startGame();
        continueGame();
        endGame();
    }
}
