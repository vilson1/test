package wraperClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        // add() method ->fut nje element ne liste
        // size()--> kthen gjatesine e nje liste
        //get(index) --> kthen elementin e nje liste ne nje indeks te caktuar
        //clear() --> fshin te gjitha elementet nga lista
        // list=new ArrayList<>(); --> krijon listen nga fillimi keshtu qe fshin te gjitha elementet e listes se vjeter
        // contains() -> kthen nje boolean nese nje element i caktuar ndodhet ne liste
        // remove(index) -> fshin nga lista nje element ne nje index te caktuar
        // isEmpty() -> kthe nje boolian nese lista eshte bosh
        // equals() --> kthen nje boolian dhe tregon nese nje liste eshte e barabarte me nje liste tjeter
        // inxexOf(Objektin) --> kthen indeksin e nje objekti te dhene // inxexOf(Objektin)-> { 2,3,2,2,4,5,2,2,6,7}
        //lastIndexOf --> kthen indeksin e nje numri te dhene i cili eshte numri i fundit i perseritur.

        list.add(5);
        System.out.println(list);
        list.add(100);
        list.add(3);
        list.add(7);
        list.add(5);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(0));

        list.clear();
        System.out.println(list);
        list.add(100);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(100);
        list.add(3);
        list.add(7);
        list.add(5);
        System.out.println(list);

        System.out.println(list.contains(7));
        list.remove(0);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(100));


    }
}
