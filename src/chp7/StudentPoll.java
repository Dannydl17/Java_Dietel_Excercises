package chp7;

public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] number = new int[6];

        for (int num = 0; num < responses.length; num++){
            try {
                ++number[responses[num]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf(" responses[%d] = %d%n%n",
                        num, responses[num]);
            }
        }
        System.out.printf("%s%10s%n", "Rating", "number");

        for (int rating = 1; rating < number.length; rating++) {
            System.out.printf("%6d%10d%n",rating,number[rating]);
        }
    }
}
