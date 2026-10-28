package Strings;

/*
* Expected Input: Vijay 
* Expected Output: yajiV
*/

import java.util.Scanner;

public class ReversalOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = sc.nextLine();

        System.out.println("-----------------------------");
        System.out.println("Reversal with For Loop :");
        System.out.println("-----------------------------");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        System.out.println("-----------------------------");
        System.out.println("Reversal with StringBuilder :");
        System.out.println("-----------------------------");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        sc.close();
    }

}