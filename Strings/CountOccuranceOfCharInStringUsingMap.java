package Strings;

/*
* Expected Input: apple 
* Expected Output: p-2 a-1 e-1 l-1
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccuranceOfCharInStringUsingMap {

    public static String countOccuranceOfCharInString(String str) {
        // Map to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Optional: If you only want to count letters (ignoring spaces/symbols)
            if (Character.isLetter(ch)) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text :");
        String input = sc.nextLine();
        System.out.println("Answer is :\n" + countOccuranceOfCharInString(input));
        sc.close();
    }
}
