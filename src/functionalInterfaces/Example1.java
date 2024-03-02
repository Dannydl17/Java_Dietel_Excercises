package functionalInterfaces;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);

        numbers.forEach((number)-> System.out.println(number));
    }
}
