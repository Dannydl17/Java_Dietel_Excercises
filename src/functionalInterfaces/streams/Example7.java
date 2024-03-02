package functionalInterfaces.streams;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100,2,30,4,1,5,5,1);



        List<Integer> nums = numbers.stream()
                                    .distinct()
                                    .sorted()
                                    .toList();
        System.out.println(nums);
    }

}
