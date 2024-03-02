package functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (word, name)-> word.substring(0,5);

        System.out.println(biFunction.apply("Tomme", "Tomme"));
    }
}
