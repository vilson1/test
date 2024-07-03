package method_overloading;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
         /* 1. create a method that can merge two integer arrays.

         	2. create a method that can merge two double arrays.

            3. create a method that can merge two char arrays.

            4. create a method that can merge two String arrays.*/

    //kjo metode bashkon 2 int array
    public static int[] mergeArrays(int[] firstArray, int[] secondArray){
        int mergedArrayLenth=firstArray.length+secondArray.length;
        int[] mergedArray=new int[mergedArrayLenth];
        int indexCount=0;
        for (int eachElement : firstArray) {
            mergedArray[indexCount]=eachElement;  //[1,2,3,4,5]
            indexCount++;
        }
        // indexCount=5
        for(int eachElement  :  secondArray){
            mergedArray[indexCount]=eachElement;
            indexCount++;
        }
         return mergedArray;

    }

    //kjo metode bashkon 2 double arrays

    public static double[] mergeArrays(double[] firstArray, double[] secondArray){
        int mergedArrayLenth=firstArray.length+secondArray.length;
        double[] mergedArray=new double[mergedArrayLenth];
        int indexCount=0;
        for (double eachElement : firstArray) {
            mergedArray[indexCount]=eachElement;  //[1,2,3,4,5]
            indexCount++;
        }
        // indexCount=5
        for(double eachElement  :  secondArray){
            mergedArray[indexCount]=eachElement;
            indexCount++;
        }
        return mergedArray;

    }

    //kjo metode  bashkon 2 char arrays
    public static char[] mergeArrays(char[] firstArray, char[] secondArray){
        int mergedArrayLenth=firstArray.length+secondArray.length;
        char[] mergedArray=new char[mergedArrayLenth];
        int indexCount=0;
        for (char eachElement : firstArray) {
            mergedArray[indexCount]=eachElement;  //[1,2,3,4,5]
            indexCount++;
        }
        // indexCount=5
        for(char eachElement  :  secondArray){
            mergedArray[indexCount]=eachElement;
            indexCount++;
        }
        return mergedArray;
    }

    //kjo metode bashkon 2 String arrays
    public static String[] mergeArrays(String[] firstArray, String[] secondArray){
        int mergedArrayLenth=firstArray.length+secondArray.length;
        String[] mergedArray=new String[mergedArrayLenth];
        int indexCount=0;
        for (String eachElement : firstArray) {
            mergedArray[indexCount]=eachElement;  //[1,2,3,4,5]
            indexCount++;
        }
        // indexCount=5
        for(String eachElement  :  secondArray){
            mergedArray[indexCount]=eachElement;
            indexCount++;
        }
        return mergedArray;
    }


    public static void main(String[] args) {
        int[] intArray1={1,2,3,4};
        int[] intArray2={1,2,3,4};
        int[] intArray=mergeArrays(intArray1,intArray2);
        System.out.println( Arrays.toString(intArray));
        String[] str1=vendosFjaletNgaTastjera(3);
        String[] str2=vendosFjaletNgaTastjera(2);
        String[] mergedStr=mergeArrays(str1,str2);
        System.out.println(Arrays.toString(mergedStr));
    }
    public static String[] vendosFjaletNgaTastjera(int arrayLength){
        String[] array=new String[arrayLength];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Shkruani fjalen e "+(i+1)+".");
            array[i]=input.next();
        }
        return array;
    }



}
