package functionalInterfaces.streams;

import java.util.Set;
import java.util.stream.Collectors;

public class Joining1 {
    public static void main(String[] args) {
        Set<String> numbers = Set.of("100","2","30","4","5","1");


        String nums = numbers.stream()
//                             .collect(Collectors.joining());
                               .collect(Collectors.joining(","));
//                             .collect(Collectors.joining(",","(",")"));
        System.out.println(nums);
    }

}
