//package chp4;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class TaxCalculator1 {
//        private static String[] nameBox;
//    private static int[] salaryBox;
//    private static double [] currentTaxRate;
//
//    private static Scanner keyboardInput = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        userName();
//
//    }
////
//    public static void userName() {
//
////        int earning = 0;
////        String name;
////        int tax = 15;
////        int tax1 = 20;
////        double newTax = 0;
////        double taxAmount = 0;
//
////
//
//        for (int row = 0; row <= 2; row++) {
//            System.out.print("Enter your name: ");
//            String user = keyboardInput.nextLine();
//
////            String[] userNAme = new String[row];
////            double[] salaryBox = new double[3];
//            if (user.matches("^[a-zA-Z]")) {
//                nameBox[row] = user;
//            }
//
//            System.out.print("Enter your earning: ");
//            double earning = keyboardInput.nextDouble();
//            if (user.matches("^[a-zA-Z]")) {
//                salaryBox[row] = (int) earning;
//
//            }
////            System.out.println(Arrays.toString(nameBox));
////            System.out.println(Arrays.toString(salaryBox));
//        }
//        workCalculated();
//    }
//
//
//    public static void workCalculated() {
////                double[] currentTaxRate = new double[row];
//        double taxRate1 = (float) 15 / 100;
//        double taxRate2 = (double) 20 / 100;
//
//        for (int row = 0; row < salaryBox.length; row++) {
//            if (salaryBox[row] <= 30000) {
////                taxRate1 = (double) t / 100;
//                currentTaxRate[row] = salaryBox[row] * taxRate1;
//
//            }
//            if (salaryBox[row] > 30000) {
////                taxAmount = (double) tax1 / 100;
//                currentTaxRate[row] = salaryBox[row] * taxRate2;
//            }
//
//
////                System.out.println("TotalTax is: " + currentTaxRate[row]);
//            System.out.println("TotalTax is: " + currentTaxRate[row]);
//
//        }
//
//    }
//
//    public static void setNameBox(String[] nameBox) {
//        TaxCalculator.nameBox = nameBox;
//    }
//
//
//    public static void setSalaryBox(int[] salaryBox) {
//        TaxCalculator.salaryBox = salaryBox;
//    }
//}




