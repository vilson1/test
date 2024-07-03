package methods;

import java.util.Scanner;


public class MethodIntro {

    public static void pershendetje(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("--------Start");
        pershendetje();
        numratCift();
        Scanner input=new Scanner(System.in);
        System.out.println("Shkruani nje numer");
        int number=input.nextInt();
        tekACift(number);
        System.out.println("Shkruani nje fjale!");
        String fjala=input.next();
        isPolyndrome(fjala);
        isPolyndrome("radar");
        isPolyndrome("Java");
        isPolyndrome("level");
        System.out.println("-------End");


    }



    //Krijoni nje metode qe printon numrat cift nga 1-20

    public static void numratCift(){
        for(int i=0; i<=20; i++){
            if (i%2==0){
                System.out.println("numri "+ i+" eshte cift");
            }
        }
    }

    public static void tekACift(int number){
        if (number%2==0){
            System.out.println("numri "+number +" eshte cift!");
        }else {
            System.out.println("numri "+number +" eshte tek!");
        }
    }

    //krijoni nje metode qe tregon nese nje fjale eshte polyndrome

    public static void isPolyndrome(String fjala){ //vilson
        boolean isPalindrome = true;//reset for each word
        int startIndex = 0; //1
        int endIndex = fjala.length() - 1; //4

        for (int i = 0; i < fjala.length() / 2; i++) {

            if (fjala.charAt(startIndex) != fjala.charAt(endIndex)) {
                isPalindrome = false;
                break;
            }
            startIndex++;
            endIndex--;
        }
       if (isPalindrome==true){
           System.out.println("fjala eshte plolyndrome => " + fjala);
       }else {
           System.out.println("fjala nuk eshte plolyndrome => " + fjala);

       }
    }


}
