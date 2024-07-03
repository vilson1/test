package exceptions_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Shkruani moshen");
        int age=scanner.nextInt();
        /*if (age<0){
            throw new InputMismatchException("Age can not be negative "+age);
        }*/

        int kohaNeOre= scanner.nextInt();
        if (kohaNeOre>2){
            CostomExceptions.pauseExxeption("Eshtre koha per pushim");
        }
    }

}
