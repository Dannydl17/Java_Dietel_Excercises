package functionalInterfaces.streams;

import java.util.List;

import static java.util.Arrays.stream;


public class Example {
    public static void main(String[] args) {
        Integer result = List.of(10,20,30,40)
            .stream()
            .mapToInt((num)->num)
            .sum();
////            .map(String::valueOf)
//            .reduce(0,(x, y)-> x + y);
////            .orElseThrow();

        System.out.println(result);
    }
}
