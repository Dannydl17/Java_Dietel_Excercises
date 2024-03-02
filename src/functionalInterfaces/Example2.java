package functionalInterfaces;

import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "one", 1,
                "Two", 2,
                "Three", 3
        );
        map.forEach((word, number)-> System.out.println(number + " in word is " + word));
    }
}
