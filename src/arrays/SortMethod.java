package arrays;
import java.util.Arrays;
public class SortMethod {
    public static void main(String[] args) {
        int[] numbers={1,3,9,6,4,7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] emrat={"Vilson","Rezi","Rizi","Ornel"};
        char[] chars={'A','a','b','B'};
        Arrays.sort(emrat);
        System.out.println(Arrays.toString(emrat));
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
    }
}
