package Streams;

/*
* Expected Size: "Test", "Test1", "Test2", "Name", "FirstName", "LastName", "Revenue","Yearly", "Cost", "Random"
* Expected Input: test
* Expected Output: [test, test1, test2]
*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Top10MatchingText {
    public static void main(String[] args) {
        List<String> contentList = Arrays.asList("Test", "Test1", "Test2", "Name", "FirstName", "LastName", "Revenue",
                "Yearly", "Cost", "Random");

        System.out.println("Enter The Text: ");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<String> matchStrings = contentList.stream().map(n -> n.toLowerCase())
                .filter(n -> n.startsWith(input) || n.contains(input)).limit(10).toList();
        System.out.println(matchStrings);

        scan.close();

        for (String str : matchStrings) {
            System.out.println(str);
        }
    }
}