package task2;


 import java.util.ArrayList;
 import java.util.Scanner;

public class CheckApp {
    private static String customerName;
    private static int userInput;
    private static double subTotal;
    private static double calculateAmount;
    private static double vatAmount;
    private static double billTotal;
    private static String cashierName;
    private static double customerAmount;
    private static double totalTotal;

    static Scanner input = new Scanner(System.in);
    private static final ArrayList<String> listItems = new ArrayList<>();

    private static final ArrayList<Integer> quantityList = new ArrayList<>();

    private static final ArrayList<Double> perUnitList = new ArrayList<>();
    private static final ArrayList<Double> totalList = new ArrayList<>();

    public static void main(String[] args) {
        prompt();
        askQuestion();
       customerQuestion();
        secondReceipt();
    }

    public static void prompt() {
        System.out.println("What is the customer's name?:   ");
        customerName = input.nextLine();
    }


    public static void askQuestion() {
        System.out.println("What did the user buy?  ");
        String userCart = input.next();
        listItems.add(userCart);
        askQuestion1();
    }

    public static void askQuestion1() {
        System.out.println("How many pieces?  ");
        int userCart1 = input.nextInt();
        quantityList.add(userCart1);
        askQuestion2();
    }

    public static void askQuestion2() {
        System.out.println("How much per unit?   ");
        double userCart2 = input.nextDouble();
        perUnitList.add(userCart2);
        question();
    }

    public static void question(){
        System.out.println("Add more Items? ");
        String userCart3 = input.next();
        if (userCart3.equals("yes"))
            askQuestion();
        if (userCart3.equals("no"))
            askQuestion3();
    }
    public static void askQuestion3(){
        System.out.println("What is cashier's name?:   ");
        cashierName = input.next();
        askQuestion4();
    }

    public static void askQuestion4(){
        System.out.println("How much discount will he get:  ");
        userInput = input.nextInt();
        firstReceipt();
    }

    public static void calculateItems1() {
        double total;
        for (int index = 0; index < listItems.size(); index++) {
            total = quantityList.get(index) * perUnitList.get(index);
            System.out.format("                    %-15s%-15d%-15.2f%-15.2f\n", listItems.get(index), quantityList.get(index), perUnitList.get(index), total);
            totalList.add(total);
        }
    }

    public static void printLine(){
        System.out.print(
                """
                -----------------------------------------------------------------------------
                """
        );
    }

    public static double addItemsTogether1(){
        for (int index = 0; index < totalList.size(); index++){
            subTotal+= totalList.get(index);
        }
        return subTotal;
    }

    public static void printSubTotal(){
        System.out.format("                                               Sub Total:      %.2f\n",   subTotal);
    }

    public static double calculateDiscount(){
      double results = (double) userInput / 100;
      calculateAmount = subTotal * results;
      return calculateAmount;
    }

    public static void printDiscount(){
        System.out.format("                                                Discount:      %.2f\n",calculateAmount);
    }


    public static double calculateVat(){
        double results = 17.50 / 100;
        vatAmount = subTotal * results;
        return vatAmount;
    }

    public static void printVatAmount(){
        System.out.format("                                               VAT @ 17.50:    %.2f\n",  vatAmount);
    }

    public static double calculateBillTotal(){
        totalTotal = (subTotal - calculateAmount) + vatAmount;
        return totalTotal;
    }
    public static void printTotal(){
        System.out.printf("                                             Bill Total:        %.2f\n", totalTotal);
    }


    public static void printLine1(){
        System.out.print(
                """
                ============================================================================
                """
        );
    }

    public static void printLine2(){
        System.out.print(
                """
                ============================================================================
                """
        );
    }

    public static void firstReceipt(){
        System.out.println(
                """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date: 18-Dec-22 8:48:11 pm""");
                System.out.println("Cashier: " + cashierName);
                System.out.println("Customer Name: " + customerName);
                System.out.println(
                """
                ==============================================================================
                                     ITEM          QTY            PRICE        TOTAL(NGN)
                -----------------------------------------------------------------------------""");
               calculateItems1();
               printLine();
        System.out.format("                                               Sub Total:      %.2f\n", addItemsTogether1());
        System.out.format("                                               Discount:       %.2f\n" ,  calculateDiscount());
        System.out.format("                                              VAT @ 17.50:     %.2f\n", calculateVat());
               printLine1();
        System.out.format("                                              Bill Total:      %.2f\n",calculateBillTotal());
               printLine2();
               System.out.printf("                      THIS IS NOT AN RECEIPT KINDLY PAY %.2f\n   " , totalTotal);
               printLine1();
    }

    public static void customerQuestion() {
        System.out.println("How much did the customer give to you?    ");
        customerAmount = input.nextDouble();
        customerCheck();
    }


    public static void amountPaid(){
        System.out.printf("                                             Amount Paid:       %.2f\n", customerAmount);
    }

    public static void customerCheck(){
        if (customerAmount < totalTotal) {
            System.out.println("Please enter the real amount");
            customerQuestion();
        }
    }
  public static void totalBalance(){
        double balanceAmount = customerAmount - totalTotal;
        System.out.printf("                                                Balance:         %.2f\n",balanceAmount);
  }

    public static void secondReceipt(){
        System.out.println(
                """
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date: 18-Dec-22 8:48:11 pm""");
                System.out.println("Cashier: " + cashierName);
                System.out.println("Customer Name: " + customerName);
                System.out.println(
                """
                  ==============================================================================
                                     ITEM          QTY            PRICE        TOTAL(NGN)
                  -----------------------------------------------------------------------------""");
                calculateItems1();
                printLine();
                printSubTotal();
                printDiscount();
                printVatAmount();
                printLine1();
                printTotal();
                amountPaid();
                totalBalance();
        System.out.println(
                """
                =============================================================================
                                         THANK YOU FOR YOUR PATRONAGE               \s
                =============================================================================
                """);


    }
}



