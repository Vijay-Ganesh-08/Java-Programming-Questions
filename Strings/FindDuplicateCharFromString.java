package Strings;

/*
* Expected Input: Programming 
* Expected Output: r, g, m
*/

import java.util.Scanner;

public class FindDuplicateCharFromString {

    public static String findDuplicateCharFromString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (str.charAt(i) != ' ') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && (i != j)) {
                        count++;
                    }
                }
                if (count == 1) {
                    result += str.charAt(i) + ", ";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text :");
        String input = sc.nextLine();
        System.out.println("Answer is : " + findDuplicateCharFromString(input));
        sc.close();
    }
}
