package task;

public class StringArray {
        public static int canRemoveDigit(String[] given) {
            int total = 0;
            for (int index = 0; index < given.length; index++) {
                System.out.println(given[index]);
                for (int column = 0; column < given[index].length(); column++) {
                    System.out.println(given[column]);
                    if (given[index].charAt(column) == '0' || given[index].charAt(column) == '1' ||  given[index].charAt(column) == '2' || given[index].charAt(column) == '3' || given[index].charAt(column) == '4' || given[index].charAt(column) == '5' || given[index].charAt(column) == '6' || given[index].charAt(column) == '7' || given[index].charAt(column) == '8' || given[index].charAt(column) == '9'){
                        total ++;
                    }
                }
            }
            return total;
        }


}

