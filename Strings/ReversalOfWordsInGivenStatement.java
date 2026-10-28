package Strings;

/*
* Expected Input: Java is best programming language
* Expected Output: language programming best is Java
*/

import java.util.Scanner;

public class ReversalOfWordsInGivenStatement {
    public static String reverseSentenseWithoutReverseWord(String str) {
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
            for (int j = k; j < str.length(); j++) {
                if (str.charAt(j) != ' ') {
                    temp += str.charAt(j);
                    k++;
                } else {
                    k++;
                    break;
                }
            }
            arr[i] = temp;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i] + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String str = sc.nextLine();
        System.out.println(reverseSentenseWithoutReverseWord(str));
        sc.close();
    }
}
