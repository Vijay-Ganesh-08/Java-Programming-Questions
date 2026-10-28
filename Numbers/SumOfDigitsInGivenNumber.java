package Numbers;

/*
* Expected Input: 12345
* Expected Output: Sum of digits of 12345 is: 15
*/

import java.util.Scanner;

public class SumOfDigitsInGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = scanner.nextInt();
        int sumOfDigits = calculateSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " +
                sumOfDigits);
        scanner.close();
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum = sum + digit; // Add the digit to sum
            number = number / 10; // Remove the last digit from number
        }
        return sum;
    }
}
