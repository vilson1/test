package day9;
import java.util.Scanner;
public class ScaaanerClass {
   /* public static void main(String[] args) {

  *//*      int mosha;
        boolean puna;
        Scanner input = new Scanner(System.in);
        System.out.println("shkruani moshen!");
        mosha = input.nextInt();

        if (mosha < 18) {
            System.out.println("Une nuk jam femije!");
        } else if (mosha >= 18 && mosha <= 60) {
            System.out.println("Une jam i rritur!");
        } else {
            System.out.println("Une jam i plakur");
        }
        System.out.println("Shkruani nese jeni te punesuar!");
        puna = input.nextBoolean();

        if (puna) {
            System.out.println("Une jam i punesuar");
        } else {
            System.out.println("Une jam i papune!");
        }

        String emri;
        System.out.println("Shkruani emrin!");
        emri=input.next();
        //System.out.println("emri = " + emri);
        input.nextLine();
        emri = input.nextLine();
        System.out.println("emri2 = " + emri);

        System.out.println("=============================================");
        //Merr apo jo kredi.  duhet te jesh i punesuar, duhet te kesh nje page mbi 700 euro,
        // duhet te keshe shtepi per kolateral, mosha max mbi 70 vjec, mbi 1 vit pune. kompania ku punon

        String kompania;
        boolean punesimi;
        double paga;
        boolean kolaterali;
        int eksperienca;

        System.out.println("Jeni i punesuar?");
        punesimi=input.nextBoolean();
        System.out.println("sa eshte paga?");
        paga=input.nextDouble();
        System.out.println("keni kolateral?");
        kolaterali=input.nextBoolean();
        System.out.println("sa vite pune keni?");
        eksperienca=input.nextInt();
        System.out.println("Shkruani moshen!");
        mosha=input.nextInt();
        System.out.println("si eshte emri i kompanise?");
        input.nextLine();
        kompania=input.nextLine();

        if (punesimi && kolaterali){
            if (paga>=700){
                if (eksperienca>=1 && mosha<=70){
                    System.out.println("Ju mund te merrni kredi");
                }else {
                    System.out.println("Nuk mund te merrni kredi");
                }
            }else {
                System.out.println("Nuk mund te merrni kredi");
            }
        }else {
            System.out.println("Nuk mund te merrni kredi");
        }
        System.out.println("kompania = " + kompania);*//*

        System.out.println("---------------------------------------------");
        //shkruani nje program ju shkruani numrin e muajit. dhe te printon emrin e muajit.
        Scanner input=new Scanner(System.in);
        
       // String name=input.nextLine();
        //System.out.println("name = " + name);
      *//*  int numriIMuajit;
        System.out.println("Shkuani numrin e muajit!");
        numriIMuajit=input.nextInt();
        switch (numriIMuajit){
            case 1:
                System.out.println("muaji Janar");
                break;
            case 2:
                System.out.println("muaji Shkurt");
                break;
            case 3:
                System.out.println("muaji Mars");
                break;
            case 4:
                System.out.println("muaji Prill");
                break;
            case 5:
                System.out.println("muaji MAj");
                break;
            case 6:
                System.out.println("muaji Qershor");
                break;
            case 7:
                System.out.println("muaji Korrik");
                break;
            case 8:
                System.out.println("muaji Gusht");
                break;
            case 9:
                System.out.println("muaji Shtator");
                break;
            case 10:
                System.out.println("muaji Tetor");
                break;
            case 11:
                System.out.println("muaji Nentor");
                break;
            case 12:
                System.out.println("muaji Dhjetor");
                break;
            default:
                System.err.print("numer i gabuar!");
        }*//*
        input.close();
    }*/

    public static void main(String[] args) {
        /*
         7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.
            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
         */
        Scanner input = new Scanner(System.in);
        String email;
        System.out.println("Enter the e-mail: ");
        email = input.next();
        int underScore = email.indexOf('_');
        String firstName = email.substring(0, underScore);
        int atChar = email.indexOf('@');
        String lastName = email.substring(underScore + 1, atChar);
        String domain = email.substring(atChar);


        if (email.contains("_")) {
            System.out.println(lastName + '_' + firstName + domain);
        } else {
            System.out.println("email");
        }
        input.close();
    }

}
