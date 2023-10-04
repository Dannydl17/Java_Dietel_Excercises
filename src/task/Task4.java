package task;

public class Task4 {
    public static void main(String[] args) {
        int total = 0;
        for (int count = 1; count <=10; count++) {
            if(count % 2 == 0) {
                System.out.println(count);
                total += count;
            }
        }
        System.out.println("The sum of the even number: " + total);
    }
}
