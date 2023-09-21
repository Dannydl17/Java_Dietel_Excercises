package chp4;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int decimalEquivalent = 0;
        int bit = 1;
        int binaryInteger;

        System.out.print("Enter a binary integer: ");
        binaryInteger = keyboardInput.nextInt();

        while (binaryInteger != 0) {
            decimalEquivalent = decimalEquivalent + binaryInteger % 10 * bit;
             binaryInteger = binaryInteger / 10;
             bit = bit * 2;
        }
        System.out.print("The decimal equivalent is: "+ decimalEquivalent);
    }
}
