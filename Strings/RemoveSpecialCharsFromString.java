package Strings;

/*
* Expected Input: vijay123@#
* Expected Output: vijay123
*/

import java.util.Scanner;

public class RemoveSpecialCharsFromString {
    public static String checkSpecial(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') ||
                    (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
                    (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(checkSpecial(str));
        sc.close();
    }
}
