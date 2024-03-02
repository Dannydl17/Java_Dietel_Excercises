package functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (word, name)-> word.length() == name.length();

        System.out.println(biPredicate.test("Joy", "To"));
    }
}
