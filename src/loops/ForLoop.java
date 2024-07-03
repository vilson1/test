package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // printojme numrat 1-10

        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");*/

        for (int i = 1; i <= 10; i++) {
           // System.out.println(i);
        }
        //printoni numrat cift 1-50

        for (int i = 2; i <51 ; i+=2) {
            //System.out.println(i);
        }

        for (int i = 1; i <=50 ; i++) {
            if (i%2==0){
                //System.out.println(i);
            }
        }

        //per numrat nga 1-100 nese eshte numer tek ne vent te numrit printo tek nese eshte cift printo numrin

        for (int i = 1; i <101 ; i++) {
            if (i%2!=0){
               // System.out.println("tek");
            }else {
                //System.out.println(i);
            }
        }

        //mblidhni te gjithe numrat nga 1-20  1+2+#+4+5...+20

        int mbledhja=0;
        for (int i = 1; i <=20 ; i++) {
            mbledhja+=i;
            //System.out.println("mbledhja = " + mbledhja);
        }

        // fjala Java te kthehet mbrapsh -->avaJ

        String java="Java";
        String  java2="";
        for (int i = 3; i >=0 ; i--) {
            java2=java2+java.charAt(i);
            System.out.println(java2);
        }

        //fusni nje fjale nga tastjera dhe kjejeni ne te kundert

        Scanner input=new Scanner(System.in);
        System.out.println("shkruani nje fjale!");
        String fjala=input.next();
        String fjalaEKundert="";
        for (int i = 0; i <fjala.length() ; i++) {
            fjalaEKundert=fjalaEKundert+fjala.charAt(fjala.length()-1-i);
            //System.out.println("fjalaEKundert = " + fjalaEKundert);
        }

        //shkruani nje program ku gjen shumen e numrave cift 1-100  2+4+6+8+...+100

        int sum=0;
        for(int i=1; i<=100; i++){
            if (i%2==0){
                sum+=i;
                System.out.println("sum = " + sum);
            }
        }

    }
}
