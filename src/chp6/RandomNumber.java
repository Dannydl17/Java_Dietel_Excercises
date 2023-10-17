package chp6;

import java.security.SecureRandom;

import static java.lang.Math.random;

public class RandomNumber {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int n;
        System.out.println(n = (int) (random() * 2 + 6));
        System.out.println(n = (int) (random() * 4 + 50));
        System.out.println(n = (int) (random() * 0 + 7));
        System.out.println(n = (int) (random() * 1000 + 1030));
        System.out.println(n = (int) (random() * -5 + 1));
        System.out.println(n = (int) (random() * -2 + 9));
    }
}
