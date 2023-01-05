import java.util.Arrays;
import java.util.Scanner;

public class anagrams_in_JAVA {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array, str2Array);
        }
    }

    public static void main(String[] args) {
        // JAVA Program to check whether two strings are Anagrams or not
        // ACT - TAC {Anagram words}
        // if length is not equal that means they can never be anagrams

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me String 1 :- ");
        String str1 = scan.nextLine();

        System.out.println("Give me String 2 :- ");
        String str2 = scan.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("String : " + str1 + " and " + str2 + " are Anagrams of each other...");
        } else {
            System.out.println("String : " + str1 + " and " + str2 + " are NOT Anagrams of each other...");
        }

        scan.close();
    }
}
