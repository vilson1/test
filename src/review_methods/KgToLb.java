package review_methods;

import java.util.Scanner;

public class KgToLb {
    //krijoni nje metode qe konverton kg ne lb

    public static double convertKgToLb(int peshaNeKg){
        double shumezimiPerTeMarrePeshenNeLb=2.2;
        double peshaNeLb=shumezimiPerTeMarrePeshenNeLb*peshaNeKg;
        return peshaNeLb;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int peshaNeKg;
        int count=0;
        do{
            System.out.println("Shkruani peshen ne kg");
            peshaNeKg=input.nextInt();
            count++;
            if (peshaNeKg<=0){
                System.err.println("Numri duhet te jete pozitiv!");
            }
            if (count==0){
                break;
            }
        }while (peshaNeKg<=0);
        double peshaNeLb=convertKgToLb(peshaNeKg);
        System.out.println(peshaNeLb);
    }

}
