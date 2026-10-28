package Strings;

/*
* Expected Input: Vijay@123%
* Expected Output: Character : 5, Digit : 3, Special : 2
*/

import java.util.Scanner;

public class CountDiffTypesOfCharFromString {
    public static String numberOfCharDigitAndSpecial(String str) {
        int special = 0, number = 0, character = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ||
                        (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                    character++;
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    number++;
                } else {
                    special++;
                }
            }
        }
        return "Character : " + character + "\nDigit : " + number +
                "\nSpecial : " + special;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(numberOfCharDigitAndSpecial(str));
        sc.close();
    }
}
