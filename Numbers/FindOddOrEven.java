package Numbers;

/*
* Expected Input: 6; 5
* Expected Output: 6 is even.; 5 is odd.
*/

import java.util.Scanner;

public class FindOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close();
    }
}
