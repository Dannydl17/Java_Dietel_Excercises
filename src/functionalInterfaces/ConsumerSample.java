package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word) ->{
            System.out.println(word + " is having a great day with no lunch");
        };
        consumer.accept("John");
    }
}
