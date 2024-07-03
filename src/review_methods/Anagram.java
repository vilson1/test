package review_methods;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    //krijo nje metode qe tregon nese dy fjale te dhena jane anagram
    public static boolean isAnagram(String str1,String str2){
        char[] array1=str1.toLowerCase(Locale.ROOT).toCharArray();
        char[] array2=str2.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return  Arrays.equals(array1,array2);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("shkruani fjalen e pare");
        String str1=input.next();
        System.out.println("shkruani fjalen e dyte");
        String str2=input.next();
        boolean eshtAnagram=isAnagram(str1,str2);
        System.out.println("eshtAnagram = " + eshtAnagram);
    }


}
