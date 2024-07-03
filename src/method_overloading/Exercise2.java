package method_overloading;

import java.util.Arrays;

public class Exercise2 {
   /* 1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array*/

    //gjen numrin max ne nje int array
    public static int maxNumber(int[] intArray){
        int maxNumber;
        Arrays.sort(intArray);
        maxNumber=intArray[intArray.length-1];
        return maxNumber;
    }


    //gjen numrin max ne nje double array
    public static double maxNumber(double[] doubeArray){
        double maxNumber;
        Arrays.sort(doubeArray);
        maxNumber=doubeArray[doubeArray.length-1];
        return maxNumber;
    }

    //gjen numrin max ne nje short array
    public static short maxNumber(short[] shortArray){
        short maxNumber;
        Arrays.sort(shortArray);
        maxNumber=shortArray[shortArray.length-1];
        return maxNumber;
    }

    //gjen numrin max ne nje long array
    public static long maxNumber(long[] longArray){
        long maxNumber;
        Arrays.sort(longArray);
        maxNumber=longArray[longArray.length-1];
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] intArray={1,2,3,4,9,8,7,6,5};
        double[] doubleArray={1.1,5.3,10.1};

        System.out.println(maxNumber(intArray));
        System.out.println(maxNumber(doubleArray));
    }

}
