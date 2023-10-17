package practices;

public class ForLoop {
    public static void main(String[] args) {
        int[][] items = {{34,23,65}, {23,67,44,68}};
//        int count = 0;
        for(int[] iterate:items){
            for (int item: iterate){
                System.out.printf("%d\t",item);

            }
            System.out.println();

        }

        int[][] number = {{34,23,65}, {23,67,44,68}};
        int count = 0;
        for(int[] iterate:number) {
            for (int nums : iterate) {
                if (nums == 3) {
                    count++;
                }
                System.out.printf("%d\t", nums);
            }
            System.out.println();
        }
    }
}
