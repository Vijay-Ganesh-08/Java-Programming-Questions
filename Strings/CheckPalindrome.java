package Strings;

/*
* Expected Input: madam; apple
* Expected Output: It's Palindrome!; It's not Palindrome!
*/

import java.util.Scanner;

public class CheckPalindrome {
    public static String checkPalindrome(String str) {
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return "It's not Palindrome!";
            }
            j--;
        }
        return "It's Palindrome!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check: ");
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
        sc.close();
    }
}
