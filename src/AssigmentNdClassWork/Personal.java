package AssigmentNdClassWork;

public class Personal {
        public static int canAddArrayOddPosition(int[] given){
            int sum = 0;

            for (int index = 1; index <given.length; index+=2) {
                sum+=given[index];
            }
            return sum;
        }

        public static int canAddArrayEvenPosition(int[] given){
            int sum = 0;
            for (int index = 0; index <given.length; index+=2) {
                sum+=given[index];
            }
            return sum;
        }

    public static int canAddArrayOddNumber(int[] given) {
            int sum = 0;
        for (int index = 0; index < given.length; index++) {
            if (given[index] % 2 !=0) {
                sum+=given[index];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static int canAddArrayEvenNumber(int[] given) {
        int sum = 0;
        for (int index = 0; index < given.length; index++) {
            if (given[index] % 2 ==0) {
                sum+=given[index];
            }
        }
        System.out.println(sum);
        return sum;
    }
}
