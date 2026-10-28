package Strings;

/*
* Expected Input: vijay
* Expected Output: aijvy
*/

import java.util.*;

public class SortingOfString {
    public static String stringSorting(String s) {
        String str = "";
        char[] arr = new char[s.length()];
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                arr[p++] = s.charAt(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if ((arr[i] > arr[j]) && i != j) {
                    char c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
            str += arr[i];
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to sort: ");
        String str = sc.nextLine();
        System.out.println(stringSorting(str));
        sc.close();
    }
}
