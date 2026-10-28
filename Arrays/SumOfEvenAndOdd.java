package Arrays;

/*
* Expected Input: 10, 2, 8, 9, 4, 1, 5, 3, 7, 6
* Expected Output: EvenSum : 30; OddSum : 25
*/

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int[] nums = { 10, 2, 8, 9, 4, 1, 5, 3, 7, 6 };
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }
        System.out.println("EvenSum : " + evenSum);
        System.out.println("OddSum : " + oddSum);
    }
}
