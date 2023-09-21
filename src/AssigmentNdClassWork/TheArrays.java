package AssigmentNdClassWork;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
//  To create an array you basically need to specified the data types
//   Example
//  To add an element inside the array we have to call the name of the array and the index we want to add it
//   which is colors
//   if you want to see the content in an array use Arrays.toString;
//   if you want to change the element we just reassign
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] ="Yellow";

        System.out.println(Arrays.toString(colors));

//        if you know the amount of element your array will carry we use curly bracket
//        after it is being defined we can no longer change the size
//          How do we loop through an array
          int[] numbers = {100, 200};

        System.out.println(colors.length);

        for (int index = 0; index < colors.length; index++) {
            System.out.println(colors[index]);
        }
//        if we want to have the loop in reverse we can say
//        then deduct - 1
        for (int index = colors.length - 1; index >=0; index--) {
            System.out.println(colors[index]);
        }

//        Enhanced for loop
//        for (String color: colors) {
//            System.out.println(color);
//        }

//        Another is by using Array nd stream
//        Arrays.stream(colors).forEach(System.out::println);


    }

}
