package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    /*public static void main(String[] args) {
        // 1- Array - 1 dimensionale
        // int[] emri
        // int [][]
        // primitive, joprimitive


        int[] numbers=new int[5];
        numbers[1]=10;
        numbers[3]=10;
        numbers[1]=5;
        System.out.println(Arrays.toString(numbers));

        String emrat[]={"vilson","Rezi","Orneli","Sandri","Arti"};
        emrat[4]="mace";
        System.out.println(Arrays.toString(emrat));

      *//*  1. create an array that has the numbers 1 to 10
        2. create an array that has the numbers 10 to 1
        3. Write a program that asks user to enter 10 numbers :
        1. store all user entered numbers in an array
        2. find the max number
        3. find the min number*//*

        Scanner input=new Scanner(System.in);
        int[] numrat=new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Shkruani numrin e "+(i+1)+".");
            numrat[i]=input.nextInt();
        }

        //gjeni numrin me te madh ne array
        int maxNumber=numrat[0];
        for (int i = 0; i < 10; i++) {
            if (maxNumber<numrat[i]){
                maxNumber=numrat[i];
            }
        }

        //gjeni numrin me te vogel ne array

        int minNumber=numrat[0];
        for (int i = 0; i < 10; i++) {
            if (minNumber>numrat[i]){
                minNumber=numrat[i];
            }
        }
        System.out.println(Arrays.toString(numrat));
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);


        *//*4. AverageNumber:
        1. Ask the user how many numbers they want to enter
        2. get all the inputs from the user and store them into an array
        3. Iterate the array & return the average number*//*


        System.out.println("SA numra deshironi te shkruani");
        int numratEshkruara=input.nextInt();
        int[] numrat1=new int[numratEshkruara];

        for (int i = 0; i < numratEshkruara; i++) {
            System.out.println("Shkruani numrin e "+(i+1)+".");
            numrat1[i]=input.nextInt();
        }

        //mesatarja=shuma/numratEshkruara

        int shuma=0;

        for (int i = 0; i < numratEshkruara; i++) {
            shuma+=numrat1[i];
        }
        double mesatarja=shuma/numratEshkruara*0.0;

        System.out.println(Arrays.toString(numrat1));
        System.out.println("mesatarja = " + mesatarja);


    }*/
}
