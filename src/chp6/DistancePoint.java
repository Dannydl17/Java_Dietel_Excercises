package chp6;

public class DistancePoint {
    public static void main(String[] args) {
        distancePoint(6, 5,2,4);
    }

    public static double distancePoint(int firstCoordinates, int secondCoordinates, int thirdCoordinates, int fourthCoordinates){
        double distance = 0;

        distance = Math.sqrt(Math.pow((double) thirdCoordinates - (double) firstCoordinates, 2) + Math.pow((double) fourthCoordinates - (double) secondCoordinates, 2));

        return distance;
    }
}
