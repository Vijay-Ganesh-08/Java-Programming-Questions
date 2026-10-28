package Strings;

/*
* Expected Input: reaction & creation
* Expected Output: They are Anagram.
*/

import java.util.Scanner;

public class CheckAnagramsOfTwoStrings {
    public static String checkAnagram(String str, String str2) {
        char[] arr = new char[str.length()];
        char[] arr2 = new char[str2.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            arr2[i] = str2.charAt(i);
        }
        if (str.length() != str2.length()) {
            return "They have different size can't be Anagram";
        } else {
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (i != j && arr[i] > arr[j]) {
                        char ch = arr[i];
                        arr[i] = arr[j];
                        arr[j] = ch;
                    }
                    if (i != j && arr2[i] > arr2[j]) {
                        char ch = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = ch;
                    }
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] != arr2[i]) {
                return "Not Anagram";
            }
        }
        return "They are Anagram.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str = sc.nextLine();
        System.out.println("Enter Second String: ");
        String str2 = sc.nextLine();
        System.out.println(checkAnagram(str, str2));
        sc.close();
    }
}
