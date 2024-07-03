package review4;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
      /* *
         **
         ***
         ****
         ******/
        /*String star="*";
        for(int i=0; i<5; i++){
            System.out.println(star);
            star=star+"*";
        }*/
   /*     String star1="";
        int i=0;
        do {
            star1=star1+"*";
            System.out.println(star1);
            i++;
        }while (i<5);*/

        //Prompt the user to enter positive numbers continuously until
        // they enter a negative number. Calculate and print the sum of all positive numbers.

        Scanner input=new Scanner(System.in);
        int number;
        int sum=0;

       /* do {
            System.out.println("shkruani nje numer pozitiv!");
            number=input.nextInt();
            if (number>0){
                sum+=number;
            }
        }while (number>0);
        System.out.println("sum = " + sum);*/

       /* while (true){
            System.out.println("shkruani nje numer pozitiv!");
            number=input.nextInt();
            if (number<0){
                break;
            }
            sum+=number;
        }*/

        // 1  1  2  3  5  8  13 ..... Fibonacci series
       // Generate the Fibonacci series up to a given number using a do-while loop.

        int inputNumber=input.nextInt();
        int firstNumber=0;
        int secondNumber=1;

        do {
            System.out.println(firstNumber+"");
            int temp=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=temp;
        }while (firstNumber<inputNumber);

    }
}
