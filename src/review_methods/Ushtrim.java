package review_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Ushtrim {
    // krijo  nje metode ku te fusesh nje array int edhe sa elemente do
    // fshishe nga array dhe te kthen nje array te ri me elementet e mbetur

    public static int[] deleteElements(int[] arrayToDelete,int[] index){
        Arrays.sort(index);
        int numriElementeveTeMbetur=arrayToDelete.length-index.length;
        int[] elementetEMbetur=new int[numriElementeveTeMbetur];
        int j=0;
        int indeksetPerElementetEMbetur=0;
        for (int i = 0; i <arrayToDelete.length ; i++) {
            if (i!=index[j]){
               elementetEMbetur[indeksetPerElementetEMbetur]=arrayToDelete[i];
               indeksetPerElementetEMbetur++;
            }else {
                j++;
            }
            //if (j)
        }
       return elementetEMbetur;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Shkruani numrin e elementeve te array!");
        int numriIelementeveNeArray=input.nextInt();
        int[] array=new int[numriIelementeveNeArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("shkruani numrin e"+(i+1)+".");
            array[i]=input.nextInt();
        }

        int numriIElementeveQeDoFshihen;
        do {
            System.out.println("Shkruani numrin e elementeve qe do fshihen!");
            numriIElementeveQeDoFshihen=input.nextInt();
            if (numriIElementeveQeDoFshihen>array.length || numriIElementeveQeDoFshihen<0){
                System.err.println("Invalid number!");
            }else {
                break;
            }
        }while (true);
        int[] indexToDelete=new int[numriIElementeveQeDoFshihen];
        for (int i = 0; i < numriIElementeveQeDoFshihen; i++) {
            System.out.println("shkruani indexin");
            int index=input.nextInt();
            if (index>=numriIElementeveQeDoFshihen){
                System.err.println("invalid index");
                index=input.nextInt();
            }
            indexToDelete[i]=index;
        }


        System.out.println(Arrays.toString(deleteElements(array, indexToDelete)));
    }
}
