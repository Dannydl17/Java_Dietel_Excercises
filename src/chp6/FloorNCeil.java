package chp6;

public class FloorNCeil {
    public static void main(String[] args) {
        System.out.println(myFloor(1.1));
        System.out.println(myCeil(0.6));
    }
    public static int myFloor(double num){
        int x = 6;
        int largestNumber = (int) num;

        while (num > 0){
            if (num > largestNumber) {
                largestNumber = (int) num;
            }
        }
        if (largestNumber <= x) {
            return largestNumber;
        }
        return x;
    }

    public static int myCeil(double num){
        int x = 5;
        int smallestNumber = (int) num;

        while (num > 0){
            if (num < smallestNumber) {
                smallestNumber = (int) num;
            }
        }
        if (smallestNumber <= x) {
            return smallestNumber;
        }
        return x;
    }

}
