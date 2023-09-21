package AssigmentNdClassWork;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String[] vowels = {"o","e","i","u","a"};
        System.out.println("Initial array "+Arrays.toString(vowels));
        Arrays.sort(vowels);
        System.out.println("Array after the sort "+Arrays.toString(vowels));
    }
}
