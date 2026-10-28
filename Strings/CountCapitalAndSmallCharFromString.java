package Strings;

/*
* Expected Input: Vijay Software; Vijay Software123
* Expected Output: Capital: 2, Small: 11, Invalid: 0; Capital: 2, Small: 11, Invalid: 3
*/

import java.util.Scanner;

public class CountCapitalAndSmallCharFromString {
    public static String numberOfCapAndSmall(String str) {
        int cap = 0, small = 0, invalid = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    cap++;
                } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    small++;
                } else {
                    invalid++;
                }
            }
        }
        return "Capital: " + cap + "\nSmall: " + small + "\nInvalid: " + invalid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(numberOfCapAndSmall(str));
        sc.close();
    }
}
