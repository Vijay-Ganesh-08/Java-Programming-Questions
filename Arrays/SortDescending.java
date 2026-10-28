package Arrays;

/*
* Expected Input: 5, 9, 3, 1, 4, 2
* Expected Output: 9, 5, 4, 3, 2, 1
*/

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] nums = { 5, 9, 3, 1, 4, 2 };

        System.out.println("Before Sorting : " + Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("After Sorting : " + Arrays.toString(nums));
    }
}
