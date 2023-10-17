package chp6;

public class TableOne {
    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\t\tOctal\tHexadecimal");
        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hexadecimal = Integer.toHexString(i);
            System.out.printf("%d\t%s\t\t%s\t%s%n", i, binary, octal, hexadecimal);
        }
    }
}
