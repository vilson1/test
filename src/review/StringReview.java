package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StringReview {
    public static void main(String[] args) {
        // data type
        // primitive ->byte,short, int, long, double, float, boolean,
        // joprimitive -> Objects

        //wraper classes -> primitive ta kthejme ne nje objekt

        //Strings -> perdoret text
        String str = "vilson";
        str.substring(2); //lson
        str.substring(2, 3); //->l
        //equals  java  Java !=
        //equalsIgnoreCase  java JAva ==
        //contains   java   vvv

        ///loops

        //for -->kur dime sa here do perseritet nje bllok kodi
        //do while --> kur nuk dime sa here do perseritet nje bllok kodi, kodi ekzekutohet te pakten nje here
        //while  --> kur nuk dime sa here do perseritet nje bllok kodi,
        // kontrollohet kushti ne fillim nese eshte false nuk ekzekutohet asnje here
        // foreeach --> perdoret per te iteruar Arrays, Collection, Map (Data structure)

        //break --> ndalon nje loop
        // continue --> ben

        //kushtet
        // if  ->
        //if- else
        //if - if else- else
        // switch
        //boolian, long, double


        // Arrays --> arrays jane data structure
        // suporton primitive dhe jo primitive, gjatesia percaktohet ne momentin kur e inicializojme, ka indekse,
        int[] arr = new int[5]; // [0.0,0,0,0,0]
        String[] strArr = new String[10];// [null,null,,,,,,,,]
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        arr[2] = 3;
        //arr[2]=5
        //Arrays.sort(arr); -->rendit ne rendin rrites
        //Arrays.toString(arr)   --> printon nje array
        //Arrays.equals(arr1,arr2) --> krahason dy arrays, dhe kthen nje boolean true/false
        //Arrays.copyOf(arr,10); -->kopjon nje array ne nje array tjeter
        //Arrays.copyOfRange(arr,0,6); --> kopjon nje array ne nje arrat te dyte sipas indekseve te dhena
        // str.toCharArray() --> e ndan nje string ne karaktere dhe e kthen ne nje char[]
        //str.split("a")-- e ndan stringun sipas nje karakteri te caktuar
        // String str3="Jravac";
        //String str4=str3.split("a")[0]; //[Jr,v,c]//Jr

        //Methods
        //public static void login(){}
        //public static int evenNumbers(int[] arr){}
        //public static int[] evenNumber(int[] arr,int[] arr2)
        //-return type void -metoda nuk kthen nje vlere por vetem ekzekuton nje bllok kodi
        // return data type - kthen nje vlere sipas tata type te percaktuar

        //listat
        List<Integer> list = new ArrayList<>(); //{3,5,7}
        list.add(3);
        list.add(5);
        list.add(7);
        list.remove(1);
        list.contains(5);
        list.get(2); //7
        list.clear();
        list.isEmpty();
       // list.equals()
        //add() --> shton nje element ne liste
        //remove --> fshin nje element nga lista
        // contains--> kthen nje boolean true/false nese lista permban nje element te caktuar
        // get()--> kthen nje element ne nje index te caktuar
        // clear() --> fshin tre gjitha elementet nga lista
        // isEmpty() --> kthen nje boolean nese lista eshte bosh ose jo
        // equals()-->kthen nje bolean nese eshte e barabarte me nje liste tjeter
        // idexOf()--> kthen indeksin e nje elementi
        // lastIndexOf--> kthen indeksin e elementit te fundit
        //

        // jane nga Collection data structure
        // jane te ngjashme me array
        // kane indekse
        // nuk i suportojne primitive data type
        // gjatesia eshte e pa percaktuar

    }


}
