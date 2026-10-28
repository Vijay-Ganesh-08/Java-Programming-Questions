package Strings;

/*
* Expected Input: Today is Monday
* Enter char to replace: a 
* Enter string to replace with: @ 
* Expected Output: Tod@y is Mond@y
*/

import java.util.Scanner;

public class ReplaceGivenCharInString {
    public static String replaceCharacter(String str, char ch, String re) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ans = ans + str.charAt(i);
            } else {
                ans = ans + re;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter char to replace: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter string to replace with: ");
        String re = sc.next();
        System.out.println(replaceCharacter(str, ch, re));
        sc.close();
    }
}
