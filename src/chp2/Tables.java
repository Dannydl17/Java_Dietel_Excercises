package chp2;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = keyboardInput.nextInt();
        int squareA = firstNumber * firstNumber;
        int cubeA = firstNumber * firstNumber * firstNumber;

        System.out.print("Enter second number: ");
        int secondNumber = keyboardInput.nextInt();
        int squareB = secondNumber * secondNumber;
        int cubeB = secondNumber * secondNumber * secondNumber;

        System.out.print("Enter third number: ");
        int thirdNumber = keyboardInput.nextInt();
        int squareC = thirdNumber * thirdNumber;
        int cubeC = thirdNumber * thirdNumber * thirdNumber;

        System.out.print("Enter fourth number: ");
        int fourthNumber = keyboardInput.nextInt();
        int squareD = fourthNumber * fourthNumber;
        int cubeD = fourthNumber * fourthNumber * fourthNumber;

        System.out.print("Enter fifth number: ");
        int fifthNumber = keyboardInput.nextInt();
        int squareE = fifthNumber * fifthNumber;
        int cubeE = fifthNumber * fifthNumber * fifthNumber;

        System.out.print("Enter sixth number: ");
        int sixthNumber = keyboardInput.nextInt();
        int squareF = sixthNumber * sixthNumber;
        int cubeF = sixthNumber * sixthNumber * sixthNumber;

        System.out.print("Enter seven number: ");
        int sevenNumber = keyboardInput.nextInt();
        int squareG = sevenNumber * sevenNumber;
        int cubeG = sevenNumber * sevenNumber * sevenNumber;

        System.out.print("Enter eight number: ");
        int eightNumber = keyboardInput.nextInt();
        int squareH = eightNumber * eightNumber;
        int cubeH = eightNumber * eightNumber * eightNumber;

        System.out.print("Enter ninth number: ");
        int ninthNumber = keyboardInput.nextInt();
        int squareI = ninthNumber * ninthNumber;
        int cubeI = ninthNumber * ninthNumber * ninthNumber;

        System.out.print("Enter tenth number: ");
        int tenthNumber = keyboardInput.nextInt();
        int squareJ = tenthNumber * tenthNumber;
        int cubeJ = tenthNumber * tenthNumber * tenthNumber;

        System.out.print("Enter eleventh number: ");
        int eleventhNumber = keyboardInput.nextInt();
        int squareK = eleventhNumber * eleventhNumber;
        int cubeK = eleventhNumber * eleventhNumber * eleventhNumber;

        System.out.println(" number      square   cube");
        System.out.format("%5d%10d%10d%n",firstNumber, squareA , cubeA);
        System.out.format("%5d%10d%10d%n",secondNumber, squareB , cubeB);
        System.out.format("%5d%10d%10d%n",thirdNumber, squareC , cubeC);
        System.out.format("%5d%10d%10d%n",fourthNumber, squareD , cubeD);
        System.out.format("%5d%10d%10d%n",fifthNumber, squareE , cubeE);
        System.out.format("%5d%10d%10d%n",sixthNumber, squareF , cubeF);
        System.out.format("%5d%10d%10d%n",sevenNumber, squareG , cubeG);
        System.out.format("%5d%10d%10d%n",eightNumber, squareH , cubeH);
        System.out.format("%5d%10d%10d%n",ninthNumber, squareI , cubeI);
        System.out.format("%5d%10d%10d%n",tenthNumber, squareJ , cubeJ);
        System.out.format("%5d%10d%10d",eleventhNumber, squareK , cubeK);
    }
}
