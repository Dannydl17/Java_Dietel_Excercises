package chp4;
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner( System.in );

         int account;
         int beginningBalance;
         int charges;
         int credits;
         int creditLimit;
         int newBalance;
         System.out.print( "Enter Account Number (or -1 to quit): " );
         account = keyboardInput.nextInt();

         while ( account != -1 ){
                 System.out.print( "Enter beginningBalance: " );
                 beginningBalance = keyboardInput.nextInt();

                 System.out.print( "Enter Charges: " );
                 charges = keyboardInput.nextInt();

                 System.out.print( "Enter Credits: " );
                 credits = keyboardInput.nextInt();

                 System.out.print( "Enter Credit Limit: " );
                 creditLimit = keyboardInput.nextInt();

                 newBalance = beginningBalance + charges - credits;

                 System.out.printf( "New balance is %d\n", newBalance );
                 if(creditLimit > newBalance){
                     System.out.println("Credit limit exceeded");
                }
                 System.out.print( "\nEnter Account Number (or -1 to quit): " );
                 account = keyboardInput.nextInt();
                 }
             }
           }
