package methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ushtrim {
    public static void main(String[] args) {
       /* Write a program that can merge 3 arrays of integers
        Ex:
        arr1 = {30, 10, 20};
        arr2 = {15, 40, 25, 35};
        arr3 = {8, 9, 17, 5, 4, 1}
        Output:
        {30,10,20,15,40,25,35,8,9,17,5,4,1}
      */

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int lengthSum = arr1.length + arr2.length + arr3.length;

        int[] arr4 = new int[lengthSum];

        int indexcount = 0;

        for (int eachElement : arr1) { //array4 [30,10,20]
            arr4[indexcount] = eachElement;
            indexcount++;
        }
        for (int i : arr2) {
            arr4[indexcount] = i;  //array4 [30,10,20,15,40,25,35]
            indexcount++;

        }
        for (int i : arr3) {
            arr4[indexcount] = i;
            indexcount++;
        }
        System.out.println(Arrays.toString(arr4));
    }
}
