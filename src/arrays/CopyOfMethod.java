package arrays;

import java.util.Arrays;

public class CopyOfMethod {
    public static void main(String[] args) {
        //Arrays.copyOf(num1,5)
        int[] num=new int[5];
        int[] number1={1,2,3,4,5,6,7,8,9};
        int[] number2= Arrays.copyOf(number1,20);
        number2[0]=20;
        number2[9]=10;
        number2[10]=11;
        System.out.println(Arrays.toString(number2));
    }
}
