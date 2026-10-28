package Strings;

/*
* Expected Input: Today is Monday
* Given character: a 
* Expected Output: given character 'a' occurrence is 2 times
*/

import java.util.Scanner;

public class CountOccuranceOfGivenCharInString {
    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter char to search: ");
        char ch = sc.next().charAt(0);
        System.out.println("given character '" + ch + "' occurrence is " + countChar(str, ch) + " times");
        sc.close();
    }
}
