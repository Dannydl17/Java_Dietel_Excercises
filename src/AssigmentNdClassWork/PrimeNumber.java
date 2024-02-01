package AssigmentNdClassWork;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int counter=1;counter<=number;counter++){
            if(number%counter==0){
                count++;
            }
        }
        if(count==2)
            System.out.println("prime number ");
        else
            System.out.println("Not a prime number ");
    }
    }
