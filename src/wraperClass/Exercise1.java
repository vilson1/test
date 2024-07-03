package wraperClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    //krijo nje program qe elementin e fundit te listes e kethen ne 0 {1,2,3,4}->{1,2,3.0}
    public static List<Integer> indexiFunditZero(List<Integer> list){
        list.remove(list.size()-1);
        list.add(0);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        System.out.println(list);
        List<Integer> listWithZero=indexiFunditZero(list);
        System.out.println(listWithZero);

        Scanner input=new Scanner(System.in);
        System.out.println("Shkruani numrin e elementeve te listes");
        int nrElementeve=input.nextInt();
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < nrElementeve; i++) {
            System.out.println("Shkruani numrin e "+(i+1));
            list1.add(input.nextInt());
        }
        List<Integer> listWithoutDublicates=removeDublicates(list1);
        System.out.println(listWithoutDublicates);

    }

    //Krijo nje metode ku te fshishe elementet qe perseriten

    public static List<Integer> removeDublicates(List<Integer> list){
        List<Integer> uniqueElementList=new ArrayList<>();
        for (Integer eachElement : list) {
            if (!uniqueElementList.contains(eachElement)){
                uniqueElementList.add(eachElement);
            }
        }

        return uniqueElementList;
    }

}
