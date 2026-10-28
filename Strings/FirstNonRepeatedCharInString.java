package Strings;

/*
* Expected Input: Software Services 
* Expected Output: o
*/

import java.util.Scanner;

public class FirstNonRepeatedCharInString {

    public static String firstNonRepeatingString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (str.charAt(i) != ' ') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    result += str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        String result = firstNonRepeatingString(str);
        if (result != "") {
            System.out.println("Answer is : " + result);
        } else {
            System.out.println("No Non Repeating Character Found");
        }

        sc.close();
    }
}