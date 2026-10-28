package Strings;

/*
* Expected Input: Software services
* Expected Output: c
*/

import java.util.Scanner;

public class LastNonRepeatedCharInString {

    public static String lastNonRepeatingString(String str) {
        String result = "";

        for (int i = str.length() - 1; i > 0; i--) {
            int count = 0;
            if (str.charAt(i) != ' ') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && (i != j)) {
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

        String result = lastNonRepeatingString(str);
        if (result != "") {
            System.out.println("Answer is : " + result);
        } else {
            System.out.println("No Non Repeating Character Found");
        }

        sc.close();
    }

}
