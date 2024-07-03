package review_methods;

import java.util.Arrays;
import java.util.Scanner;

public class ushtrim2 {
    public static int[] deleteIndex(int[] array, int index){
        int[] newArray=new int[array.length-1];
        int newArrayIndex=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                newArray[newArrayIndex]=array[i];
                newArrayIndex++;
            }
        }
        return newArray;
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
        System.out.println("Shkruani indeksin qe do fshini");
        int indexToDelete=input.nextInt();

        System.out.println(Arrays.toString(deleteIndex(array, indexToDelete)));
    }
}
