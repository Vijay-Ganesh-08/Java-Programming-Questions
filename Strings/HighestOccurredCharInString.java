package Strings;

/*
* Expected Input: aaaaabbcddddd 
* Expected Output: a
*/

import java.util.Scanner;

public class HighestOccurredCharInString {
    public static String countMaxOccuranceOfChar(String str) {
        String result = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if (str.charAt(i) != ' ') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count++;
                    }
                }
                if (max < count) {
                    max = count;
                    result += str.charAt(i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println(countMaxOccuranceOfChar(str));
        sc.close();
    }
}
