package Strings;

/*
* Expected Input: Today is Monday
* Expected Output: yadoT si yadnoM
*/

import java.util.Scanner;

public class ReversalOfCharsInWordsForGivenStatement {
    public static String reverseWordInString(String str) {
        String result = "";
        int countSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countSpace++;
            }
        }
        String[] arr = new String[countSpace + 1];
        int k = 0;
        for (int i = 0; i < countSpace + 1; i++) {
            String temp = "";
            int len = 0;
            for (int j = k; j < str.length(); j++) {
                if (str.charAt(j) != ' ') {
                    k++;
                    len++;
                } else {
                    len++;
                    k++;
                    break;
                }
            }
            if (i == countSpace) {
                k++;
                len++;
            }
            for (int j = k - 2; j >= k - len; j--) {
                temp += str.charAt(j);
            }
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String str = sc.nextLine();
        System.out.println(reverseWordInString(str));
        sc.close();
    }
}
