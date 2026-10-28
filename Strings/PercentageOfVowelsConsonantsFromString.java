package Strings;

/*
* Expected Input: Consonents
* Expected Output: Vowels : 30.00 % , Consonent: 70.00 %
*/

import java.util.*;

public class PercentageOfVowelsConsonantsFromString {
    public static String percentageOfVowelsAndConsonent(String str) {
        int cons = 0, vowel = 0;
        float len = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
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
        }
        float v = (vowel / len) * 100;
        float c = (cons / len) * 100;
        return "Vowels : " +
                String.format("%.2f", v) + " % "
                + "\nConsonent: " + String.format("%.2f", c) + " %";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(percentageOfVowelsAndConsonent(str));
        sc.close();
    }
}
