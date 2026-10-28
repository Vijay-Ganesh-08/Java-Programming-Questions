package Strings;

/*
* Expected Input: Vijay
* Expected Output: yijaV
*/

import java.util.*;

public class SwapFirstAndLastCharInString {
    public static String swapFirstLast(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                ans += str.charAt(str.length() - 1);
            } else if (i == str.length() - 1) {
                ans += str.charAt(0);
            } else {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(swapFirstLast(str));
        sc.close();
    }
}
