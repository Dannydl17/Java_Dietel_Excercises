//package chp6.cai;
//
//
//import javax.swing.*;
//
//import static java.lang.Integer.parseInt;
//import static javax.swing.JOptionPane.showInputDialog;
//import static javax.swing.JOptionPane.showMessageDialog;
//
//public class CAIMachine {
//
//    private Student student;
//    private Multiplication multiplication;
//
//    public CAIMachine(){
//        student = new Student();
//        multiplication = new Multiplication();
//    }
//
//    public void displayWelcome(){
//        showMessageDialog(null, "Welcome!!!");
//    }
//
//    public String  getUsername(){
//        return showInputDialog(null, "Please enter your name");
//    }
//
//    public void promptUserToStartGame(){
//        student.setName(getUsername());
//        String prompt = """
//                        Hello\s"""+student.getName()+"""
//                        1.) Start Quiz
//                        2.) Back
//                        3.) Quit
//                        """;
//        String userInput = JOptionPane.showInputDialog(prompt);
//        switch (parseInt(userInput)){
//            case 1 -> multiplication.multiplyIntegers();
//            case 2 -> getUsername();
//            case 3 -> System.exit(0);
//            default -> {
//                JOptionPane.showMessageDialog(null, "Please enter either of the input above");
//                promptUserToStartGame();
//            }
//        }
//    }
//
//    public void promptUser(){
//        multiplication.multiplyIntegers();
//    }
//
//    public static void main(String[] args) {
//        CAIMachine machine = new CAIMachine();
//        machine.displayWelcome();
//        machine.promptUserToStartGame();
//        machine.promptUser();
//
//    }
//}
