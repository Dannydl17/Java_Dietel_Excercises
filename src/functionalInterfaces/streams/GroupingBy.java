package functionalInterfaces.streams;

import java.util.Set;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        Set<String> numbers = Set.of("100","2","30","4","5","1");

        System.out.println((numbers.stream()
                            .collect(Collectors.groupingBy((element)-> element.length()))));
    }
}
