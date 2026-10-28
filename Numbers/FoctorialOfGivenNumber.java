package Numbers;

/*
* Expected Input: 5
* Expected Output: 120 // 1*2*3*4*5
*/

import java.util.Scanner;

public class FoctorialOfGivenNumber {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial number is :" + factorial);
        scanner.close();
    }
}
