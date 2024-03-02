package functionalInterfaces.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(100,2,30,4,5,1);



//        List<Integer> nums = numbers.stream()
        Set<Integer> nums = numbers.stream()
                                    .distinct()
                                    .sorted()
//                                  .collect(Collectors.toCollection(ArrayList::new));
                                    .collect(Collectors.toSet());
        System.out.println(nums);
    }

}
