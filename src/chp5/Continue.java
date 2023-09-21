package chp5;

public class Continue {
    public String calculateCount(int count) {

        for (; count <=10; count++) {

            if (count == 8) {
                count++;
                System.out.printf("%d ", count);

            } else {
              System.out.printf("%d ", count);

            }
        }
        return String.valueOf(count);
    }
}

