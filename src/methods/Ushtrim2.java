package methods;

public class Ushtrim2 {
    public static void main(String[] args) {
        /*4. write a program that can count how many palindromes in an array of string
Ex:
{"anna", "level", "Java"};

output:
2*/

        String[] palindrome = {"anna", "level", "Java", "radar"};

        int countIndex = 0;

        for (String word : palindrome) {
            boolean isPalindrome = true;//reset for each word
            int startIndex = 0;
            int endIndex = word.length() - 1;

            for (int i = 0; i < word.length() / 2; i++) {

                if (word.charAt(startIndex) != word.charAt(endIndex)) {
                    isPalindrome = false;
                    break;
                }
                startIndex++;
                endIndex--;
            }
            if (isPalindrome) {
                countIndex++;
            }

        }
        System.out.println("countIndex = " + countIndex);
    }
}
