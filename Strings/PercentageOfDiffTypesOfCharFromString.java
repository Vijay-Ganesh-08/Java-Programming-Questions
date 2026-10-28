package Strings;

/*
* Expected Input: Vijay@123%
* Expected Output: Character : 50.00%, Digit : 30.00%, Special : 20.00%
*/

import java.util.Scanner;

public class PercentageOfDiffTypesOfCharFromString {
    public static String percentageOfCharDigitAndSpecial(String str) {
        int special = 0, number = 0, character = 0;
        float len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                        || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                    character++;
                } else if (str.charAt(i) >= '0' &&
                        str.charAt(i) <= '9') {
                    number++;
                } else {
                    special++;
                }
            }
        }
        float c = (character / len) * 100;
        float d = (number / len) * 100;
        float s = (special / len) * 100;
        return "Character : " + String.format("%.2f", c) + "%" +
                "\nDigit : " + String.format("%.2f", d) + "%" + "\nSpecial : " +
                String.format("%.2f", s) + "%";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(percentageOfCharDigitAndSpecial(str));
        sc.close();
    }
}
