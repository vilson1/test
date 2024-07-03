package arrays;

import java.util.Arrays;

public class EqualsMEthod {
    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={3,2,1,};
        System.out.println( Arrays.equals(num1,num2));
        Arrays.sort(num1); //1,2,3
        Arrays.sort(num2); //1,2,3
        System.out.println( Arrays.equals(num1,num2));
        System.out.println("num1.length = " + num1.length);
    }
}
