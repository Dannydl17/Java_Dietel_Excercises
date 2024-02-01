package assignments;


import java.util.Scanner;

public class PizzaApp {
    private  static  int large;
    private  static  int medium;
    private  static  int small;
    static Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfBoxes = calculateNumberOfSlices(questionSuperPerson(),
                questionHungryPerson(), questionClassicPerson());
        System.out.println("Number of slices:" + " " + numberOfBoxes);
        System.out.println("Number of boxes: " + calculateNumberOfBoxes(numberOfBoxes));
   }


    public static int questionSuperPerson() {
        System.out.println("Enter the number of super hungry person:  ");
        int numberOfSuperHungryPerson = keyboardInput.nextInt();
        return collectNumberOfSuperPerson(numberOfSuperHungryPerson);

    }

    public static int questionHungryPerson() {
        System.out.println("Enter the number of hungry person:  ");
        int numberOfHungryPerson = keyboardInput.nextInt();
        return collectNumberOfHungryPerson(numberOfHungryPerson);

    }

    public static int questionClassicPerson() {
        System.out.println( "Enter the number of classic person:  ");
        int numberOfClassicPerson = keyboardInput.nextInt();
        return collectNumberOfClassicPerson(numberOfClassicPerson);
    }

    public static int collectNumberOfSuperPerson(int number){
        int numberOfSuper = number * 4;
        return numberOfSuper;
    }
    public static int collectNumberOfHungryPerson(int num){
        int numberOfHungry = num * 2;
        return numberOfHungry;
    }
    public static int collectNumberOfClassicPerson(int nums){
        int numberOfClassic = nums * 1;
        return numberOfClassic;
    }

    public static int calculateNumberOfSlices(int superPerson, int hungryPerson, int classicPerson){
        int total = collectNumberOfSuperPerson(superPerson) + collectNumberOfHungryPerson(hungryPerson)
                + collectNumberOfClassicPerson(classicPerson);
         return total;
    }

    public static int calculateNumberOfBoxes(int total) {
        large = 10;
        medium = 6;
        small = 4;

        int num = total / large;
        int num1 = total % large;
        int nums = 0;
        int numbs = 0;
        if (num1 > medium) {
            nums = num1 % medium;
        }
        if (nums < small) {
            numbs = nums % small;
        }
        int totalNumberOfBoxes =  num + nums + numbs;
       return totalNumberOfBoxes;
    }
}
