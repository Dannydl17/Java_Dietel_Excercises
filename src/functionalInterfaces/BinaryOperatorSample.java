package functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> operator =
                (number,num)-> number.compareTo(num);

        System.out.println(operator.apply(8, 9));
    }
}
