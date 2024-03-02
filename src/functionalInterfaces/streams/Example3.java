package functionalInterfaces.streams;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        Integer result = List.of("Mango", "orange", "Banana", "Guava")
                             .stream()
                             .mapToInt(String::length)
                             .sum();

        System.out.println(result);
    }
}
