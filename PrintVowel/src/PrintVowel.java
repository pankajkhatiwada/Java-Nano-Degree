import java.util.Scanner;

/**
 * @author Pankaj Khatiwada
 */
public class PrintVowel {

    /*
    Prints the vowel only of the input word.
     */

    public static String vowelOnly(String input) {
        String vowel = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (vowel.contains(String.valueOf(c).toLowerCase())) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        System.out.println(vowelOnly(sc.nextLine()));

    }

}
