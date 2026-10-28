package Strings;

/*
* Expected Input: Sanjeeva Reddy Nagar
* Expected Output: S R Nagar
*/

import java.util.Scanner;

public class ShortNameOfGivenString {
    public static String printShortName(String str) {
        String ans = "";
        int countSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countSpace++;
            }
        }
        if (countSpace == 0) {
            ans = str;
        } else {
            int j = 0, k = 0, i;
            for (int h = 0; h < countSpace; h++) {
                ans = ans + str.charAt(j);
                for (i = k; i < str.length(); i++) {
                    if (str.charAt(i) != ' ') {
                        j++;
                        k++;
                    } else {
                        break;
                    }
                }
                j++;
                ans += " ";
                k++;
            }
            for (int n = k; n < str.length(); n++) {
                ans += str.charAt(n);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to short: ");
        String str = sc.nextLine();
        System.out.println(printShortName(str));
        sc.close();
    }
}
