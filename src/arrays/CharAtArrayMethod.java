package arrays;

import java.util.Arrays;

public class CharAtArrayMethod {
    public static void main(String[] args) {
        String emri="Jave";
        char[] charArray=emri.toCharArray();
        System.out.println(Arrays.toString(charArray));

        //kontrolloni nese dy stringje jane perbere nga te njejtat shkronja
        String emri2="vaJa";
        char[] array1=emri.toCharArray();
        char[] array2=emri2.toCharArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array1,array2));

    }
}
