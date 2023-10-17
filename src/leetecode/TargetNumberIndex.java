package leetecode;

public class TargetNumberIndex {

    public static int[] calculateAddition(int[] numberAdded, int targetNumber) {
        int[] sumIndex = new int[2];
        for (int index = 0; index < numberAdded.length; index++) {
            for (int idx = 0; idx < numberAdded.length; idx++) {
                if(index == idx)continue;
                if(numberAdded[index] + numberAdded[idx] == targetNumber){
                    sumIndex[0] = index;
                    sumIndex[1] = idx;
                    return sumIndex;
                }

            }

        }
        return null;
    }
}
