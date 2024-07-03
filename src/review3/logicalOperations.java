package review3;

import java.util.Scanner;

public class logicalOperations {
    public static void main(String[] args) {
        // && ,  || ,  ==, < ,  >,  <=,  >=, != , +, -
        //Write a program that can print the maximum number between two numbers, if both are equal then print Equal
        Scanner in=new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Shkruaj numrin e pare");
        number1=in.nextInt();
        System.out.println("Shkruaj numrin e dyte!");
        number2=in.nextInt();

        if (number1>number2){
            System.out.println("number1 = " + number1+" numri i pare eshte me i madh");
        }else if (number1<number2){
            System.out.println("number2 = " + number2+ " numri i dyte eshte me i madh");
        }else {
            System.out.println("numrat jane te barabarte!");
        }
        //in.close();
//================================================================================================
        // shkruani numrin e nje muaji dhe printo se sa dite ka ai muaj

        // 31 -> 1,3,5,7,8,10,12
        // 30 -> 4,6,9,11
        // 28-29  ->2
        //Scanner input=new Scanner(System.in);
        int numriIMuajit;
        int viti=0;
        System.out.println("Shkruani numrin e muajit!");
        numriIMuajit=in.nextInt();

        if (numriIMuajit==1 || numriIMuajit==3 || numriIMuajit==5 || numriIMuajit==7 || numriIMuajit==8 || numriIMuajit==10 || numriIMuajit==12){
            System.out.println("Muaji ka 31 dite!");
        }else if (numriIMuajit==4 || numriIMuajit==6 || numriIMuajit==9 || numriIMuajit==11){
            System.out.println("Muaji ka 30 dite");
        }else if (numriIMuajit==2){
            System.out.println("Shkruani vitin");
            viti=in.nextInt();
            if (viti%4==0){
                System.out.println("Muaji ka 29 dite");
            }else {
                System.out.println("Muaji ka 28 dite!");
            }
        }else {
            System.err.println("Numri i muajit eshte gabim");
        }
//==========================================================================

        System.out.println("Shkruani numrin e muajit!");
        numriIMuajit=in.nextInt();
            switch (numriIMuajit){
                case 1:
                    System.out.println("muaji Janar");
                    System.out.println("31 dite");
                    break;
                case 2:
                    System.out.println("muaji Shkurt");
                    System.out.println("Shkruani vitin");
                    viti=in.nextInt();
                    if (viti%4==0){
                        System.out.println("Muaji ka 29 dite");
                    }else {
                        System.out.println("Muaji ka 28 dite!");
                    }
                    break;
                case 3:
                    System.out.println("muaji Mars");
                    System.out.println("31 dite");
                    break;
                case 4:
                    System.out.println("muaji Prill");
                    System.out.println("30 dite");
                    break;
                case 5:
                    System.out.println("muaji MAj");
                    System.out.println("31 dite");
                    break;
                case 6:
                    System.out.println("muaji Qershor");
                    System.out.println("30 dite");
                    break;
                case 7:
                    System.out.println("muaji Korrik");
                    System.out.println("31 dite");
                    break;
                case 8:
                    System.out.println("muaji Gusht");
                    System.out.println("31 dite");
                    break;
                case 9:
                    System.out.println("muaji Shtator");
                    System.out.println("30 dite");
                    break;
                case 10:
                    System.out.println("muaji Tetor");
                    System.out.println("31 dite");
                    break;
                case 11:
                    System.out.println("muaji Nentor");
                    System.out.println("30 dite");
                    break;
                case 12:
                    System.out.println("muaji Dhjetor");
                    System.out.println("31 dite");
                    break;
                default:
                    System.err.print("numer i gabuar!");
        }
    }
}
