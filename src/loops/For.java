package loops;

import java.util.Scanner;

public class For {
    /*public static void main(String[] args) {
        // Write a program that can remove the duplicated characters from a String
        //  AABABC ->ABC

        Scanner input=new Scanner(System.in);
        System.out.println("Shkruani nje string");
        String str=input.next();
        String uniqueChar="";
        for(int i=0; i<str.length(); i++){
            if (!uniqueChar.contains(str.charAt(i)+"")){
                uniqueChar=uniqueChar+str.charAt(i);
                System.out.println("uniqueChar = " + uniqueChar);
            }
        }

        // Write a program that can return the unique characters from a String
        // AAABBBCCDEF ->DEF

        Scanner in=new Scanner(System.in);
        System.out.println("Shkruani nje string");
        String str2=in.next();
        String unrepeatedChar="";

        for(int j=0; j<str2.length(); j++){
            int firstIndex=str2.indexOf(str2.charAt(j));
            int lastIndex=str2.lastIndexOf(str2.charAt(j));
            if (firstIndex==lastIndex){
                unrepeatedChar=unrepeatedChar+str2.charAt(j);
                System.out.println("unrepeatedChar = " + unrepeatedChar);
            }
        }

        //Write a program that asks user to enter number for 5 times,
        // and print how many positive and negative numbers user entered

        //2,3,-6,-2,5   -->  NUMRA POZITIV=3, NUMRA NEGATIVE=2

        Scanner inn=new Scanner(System.in);
        int numratPozitive=0;
        int numratNegative=0;
        int numriZero=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Shkruani numrin e "+(i+1)+".");
            int numri=inn.nextInt();
            if (numri>0){
                numratPozitive++;
            }else if (numri<0){
                numratNegative++;
            }else {
                numriZero++;
            }

        }
        System.out.println("numratPozitive = " + numratPozitive);
        System.out.println("numratNegative = " + numratNegative);
        System.out.println("numriZero = " + numriZero);

        //Write a program that asks user to entera string and a char,
        // the returns the frequency of the char from the given string
        //  MAKINA  ->A  output 2

        Scanner scanner=new Scanner(System.in);
        System.out.println("Shkruani nje fjale!");
        String word=scanner.next();
        System.out.println("Shkruani nje shkronje!");
        String ch=scanner.next();

        int charCount=0;

        for(int i=0; i<word.length();i++){
            if ((word.charAt(i)+"").equalsIgnoreCase(ch)){
                charCount++;
            }
        }
        System.out.println("charCount = " + charCount);


    }*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sentence=scanner.nextLine();
        String word=scanner.next();
        int fjalaCount = 0;
        int wordLength = word.length();
        int sentenceLength = sentence.length();

        for (int i = 0; i <= sentenceLength - wordLength; i++) {
            if (sentence.substring(i, i + wordLength).equalsIgnoreCase(word)) {
                fjalaCount++;
            }
        }
        System.out.println("frequency = " + fjalaCount);
    }
}

