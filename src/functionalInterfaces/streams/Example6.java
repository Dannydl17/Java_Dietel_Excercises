package functionalInterfaces.streams;

import java.util.Comparator;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100,2,30,4,1,5,5,1);

//        Comparator<Integer> comparator = (a,b)-> compareDescending(a, b);


        List<Integer> nums = numbers.stream()
                                    .sorted()
                                    .distinct()
                                    .toList();
        System.out.println(nums);
    }

    private static int compareDescending(Integer a, Integer b){
        if(b>a) return 1;
        else if (a>b) return -1;
        return 0;
    }
}
