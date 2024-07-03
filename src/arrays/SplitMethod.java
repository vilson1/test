package arrays;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        //split -> ndan nje string ne nje karakter te caktuar
        String word="une quhem vilson";
        String[] words=word.split("");
        System.out.println(Arrays.toString(words));

        //ne nje adrese email do ndajme adresen dhe domain
        String email="vilson@gmail.com";
        String[] email2=email.split("@");
        System.out.println(Arrays.toString(email2));
        String domain=email2[1];

        System.out.println(domain.split("\\.")[0]);
    }
}
