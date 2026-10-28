package Strings;

/*
* Expected Input: Vijay
* Expected Output: Vowels : 2, Consonent: 3
*/

import java.util.*;

public class CountVowelsConsonantsFromString {
    public static String countVowelsAndConsonent(String str) {
        int cons = 0, vowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A'
                    || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                vowel++;
            } else {
                cons++;
            }
        }
        return "Vowels : " + vowel + "\nConsonent: " + cons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(countVowelsAndConsonent(str));
        sc.close();
    }
}
