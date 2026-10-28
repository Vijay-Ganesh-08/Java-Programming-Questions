package Strings;

/*
* Expected Input: vijay123; Myth
* Expected Output: It Contains Vowels; It doesn't have vowels
*/

import java.util.*;

public class CheckVowelsInString {
    public static String containVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' ||
                    str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                return "It Contains Vowels";
            }
        }
        return "It doesn't have vowels";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(containVowel(str));
        sc.close();
    }
}
