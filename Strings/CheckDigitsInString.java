package Strings;

/*
* Expected Input: vijay123; vijay#$
* Expected Output: Given String Contains Digits; Given String not Contains Digits
*/

import java.util.Scanner;

public class CheckDigitsInString {
    public static String checkDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                return "Given String Contains Digits";
            }
        }
        return "Given String not Contains Digits ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(checkDigit(str));
        sc.close();
    }
}
