package constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OffersObjects {
    public static void main(String[] args) {
        Ofertat oferta1=new Ofertat();
        Ofertat oferta2=new Ofertat();
        Ofertat oferta3=new Ofertat();
        Ofertat oferta4=new Ofertat();
        Ofertat oferta5=new Ofertat();
        Ofertat oferta6=new Ofertat();
        Ofertat oferta7=new Ofertat();
        Ofertat oferta8=new Ofertat();
        Ofertat oferta9=new Ofertat("ABC");
        Ofertat oferta10=new Ofertat("Tirane","BKT","Testues",1000);
        oferta1.setInfo("Tirane","ABC","Test Automation",20000,true,true);
        oferta2.setInfo("Durres","Tirana BAnk","Test Automation",22000,false,true);
        oferta3.setInfo("Berat","Sisal","Test Automation",2000,false,true);
        oferta4.setInfo("Kukes","One","Test Automation",15000,true,true);
        oferta5.setInfo("Itali","Vodafone","Test Automation",10000,true,true);
        oferta6.setInfo("Zerqan","BKT","Test Automation",250000,false,true);
        oferta7.setInfo("Tirane","EHV","Test Automation",170000,true,true);

        System.out.println(oferta1);
        System.out.println(oferta2);
        System.out.println(oferta3);
        System.out.println(oferta4);
        System.out.println(oferta5);
        System.out.println(oferta6);
        System.out.println(oferta7);
        Ofertat[] ofertatEMija={oferta1,oferta2,oferta3,oferta4,oferta5,oferta6,oferta7};
        ArrayList<Ofertat> ofertatNeList=new ArrayList<>(Arrays.asList(ofertatEMija));
        System.out.println(ofertatNeList.size());
        ofertatNeList.removeIf(p->p.paga<15000);
        System.out.println(ofertatNeList.size());
        ofertatNeList.removeIf(p-> !p.isSmartWork);
        System.out.println(ofertatNeList.size());


    }
}
