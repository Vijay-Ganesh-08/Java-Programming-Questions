package Strings;

/*
* Expected Input: Programming 
* Expected Output: r : 2, g : 2, m : 2
*/

import java.util.Scanner;

public class CountDuplicateCharCountFromString {

    public static String printDuplicateCharFromString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if (str.charAt(i) != ' ') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j) && (i != j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    result += str.charAt(i) + " : " + count + "\n";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text :");
        String input = sc.nextLine();
        System.out.println("Answer is : \n" + printDuplicateCharFromString(input));
        sc.close();
    }
}
