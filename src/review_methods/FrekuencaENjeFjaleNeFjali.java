package review_methods;

import java.util.Scanner;

public class FrekuencaENjeFjaleNeFjali {
    //krijoni nje metode qe te kthen frekuencen e nje fjale ne fjali

    public static int kthenFrekuencenEfjalesNeFjali(String fjalia,String fjala){
        int wordCount=0;
        String[] fjaliaArray=fjalia.split(" ");
        for( String cdoFjale :  fjaliaArray){
            if (cdoFjale.equals(fjala)){
                wordCount++;
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Shkruani fjaline!");
        String fjalia=input.nextLine();
        System.out.println("Shkruani fjalen!");
        String fjala=input.next();
        int wordCount=kthenFrekuencenEfjalesNeFjali(fjalia,fjala);
        System.out.println("wordCount = " + wordCount);
    }

}
