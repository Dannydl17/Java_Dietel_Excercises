package functionalInterfaces;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleSample {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = (number)->  number;
        System.out.println(longToDoubleFunction.applyAsDouble(23456789));
    }
}
