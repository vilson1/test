package loops;

import java.util.Scanner;

public class WhileLoopExercises {
    public static void main(String[] args) {
        //ktheni nje string ne krahun e kundert me while loop

        Scanner input = new Scanner(System.in);
        System.out.println("vendosni nje fjale");
       /* String str=scanner.next();
        String emptyString="";

        int i=str.length()-1;

        while (i>=0){
            emptyString=emptyString+str.charAt(i);
            i--;
        }

        System.out.println("emptyString = " + emptyString);*/

        //tregoni nese eshte polyndrome

       /* String polyndrome=scanner.next();
        int startIndex=0;
        int endIndex=polyndrome.length()-1;
       //level
        boolean isPolyndrome=true;
        while (startIndex!=endIndex){
            if (polyndrome.charAt(startIndex)!=polyndrome.charAt(endIndex)){
                isPolyndrome=false;
                break;
            }
            startIndex++;
            endIndex--;
        }
        if (isPolyndrome){
            System.out.println(polyndrome+" is polyndrome");
        }else {
            System.out.println(polyndrome+" is not polyndrome");*/
        //}

        //Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
        //    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
        //    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
        //
        //	            King Bed ==> 120$
        //	            Queen Bed ==> 100$
        //	            single Bed ==> 80$
        //
        //            the program should be able to display the room he/she reserved and total price of the room.
        //
        //            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)


       /* System.out.println(" A deshironi nje dhome:");
        String answer = input.nextLine();

        while(!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
            System.out.println("reenter answer");
            answer = input.next();
        }
        if(answer.equalsIgnoreCase("Yes")){
            input.nextLine();
            System.out.println("Which type of room you want");
            String roomType= input.nextLine();
            while (!roomType.equalsIgnoreCase("King Bed") && !roomType.equalsIgnoreCase("Queen Bed") && !roomType.equalsIgnoreCase("single Bed")){

                System.out.println("reselect the room");
                roomType=input.nextLine();
            }
        } else if (answer.equalsIgnoreCase("No")){
            System.out.println("have a nice day");
        }*/

        //llogarit faktorialin e nje numri te hene
        //5! ->5x4x3x2x1

        /*System.out.println("shkruani nje numer");
        int number=input.nextInt();
        int factorialNumber=1;

        while (number>0){
            factorialNumber*=number;
            number--;
        }
        System.out.println("factorialNumber = " + factorialNumber);*/

        //shkruani nje fjale dhe nje shkronje dhe tregoni sa here perseritet shkronja ne ate fjale

        System.out.println("shkruani nje fjale");
        String fjala=input.next();
        System.out.println("Shkruani nje shkronje");
        String shkronja=input.next();
        int charCount=0;
        //vilson
        //l
        int index=0;
        while (index<fjala.length()){
            if (shkronja.equals(fjala.charAt(index)+"")){
                charCount++;
            }
            index++;
        }
        System.out.println("charCount = " + charCount);

    }
}
