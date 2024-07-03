package arrays;
import java.util.Arrays;
public class CopyOfRangeMethod {
    public static void main(String[] args) {
        //copyOfRange(emri,startIndex,EndIndex)
        char[] chars={'a','b','c','d','e'};
        char[] chars1=Arrays.copyOfRange(chars,1,3);
        System.out.println(Arrays.toString(chars1));

        int[] piket={10,20,30,40,50,60,70,80,90,100};
        int[] piketPerNotenMbi8=Arrays.copyOfRange(piket,7,piket.length);//10-1=9
        System.out.println(Arrays.toString(piketPerNotenMbi8));

        //toString-->per te printuar nje Array
        //sort --> rendit ne rendin rrites
        //copyOfRange (enmri i array qe kopjojme,startIndex,endIndex)
        // copy(emrin e array qe do kopjojme, gjatesine qe do kete array i ri)
        //equals(array1,array2) --true/false
    }
}
