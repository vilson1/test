package review5;

import java.util.ArrayList;
import java.util.List;

public class Review {
    // for ->kur e dime sa here sa here do ekzekutohet nje bllok kodi
    //for each -->eshte loop qe perdoret per arrays, collections, Map (Data structure)
    //while --> kontrollon kushtin pastaj behet ekzekutimi
    // do while --> behet ekzekutimi pastaj kontrollohet kushti

    public static void main(String[] args) {
        for (int i = 10; i > 0; i++) {
            //kodi qe do ekzekutohet
            i=i*2;
        }

        while (true){
            //kodi qe do te ekzekutohet
            break;
        }

        /*do {
            //kodi qe do te ekzekutohet
        }while (true);*/
        int[] intArray=new int[5];
        String[] emratArray={"vilson","ornel"};
        String[] emratArray1=new String[2];
        emratArray1[0]="vilson";
        emratArray1[1]="ornel";

        List<Integer> intList=new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(100);

        for (String cdoEmer : emratArray){
            if (cdoEmer.equals("vilson")){
                break;
            }
        }

        //krijo nje metode qe shumezon me 2 te gjitha elementet e nje liste
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(shumezonElementetMeDy(list));

        Makinat WW1=new Makinat("Bardhe",2020);
        Makinat WW2=new Makinat();
        WW2.ngjyra="E BArdhe";
        WW2.vitiProdhimit=2024;
        System.out.println(WW1);
        System.out.println(WW2);
    }

    public static List<Integer> shumezonElementetMeDy(List<Integer> list){
        List<Integer> listaMeElementetEDyfishuar=new ArrayList<>();

        for (int cdoElement : list){
            listaMeElementetEDyfishuar.add(cdoElement*2);
        }
        return listaMeElementetEDyfishuar;

    }
}
