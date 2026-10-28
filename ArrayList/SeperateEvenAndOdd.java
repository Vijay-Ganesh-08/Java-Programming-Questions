package ArrayList;

/*
* Expected Input: 10, 2, 8, 9, 4, 1, 5, 3, 7, 6
* Expected Output: EvenList : [10, 2, 8, 4, 6]; OddList : [9, 1, 5, 3, 7]
*/

import java.util.ArrayList;

public class SeperateEvenAndOdd {
    public static void main(String[] args) {
        int[] nums = { 10, 2, 8, 9, 4, 1, 5, 3, 7, 6 };
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);
            }
        }
        System.out.println("EvenList : " + evenList);
        System.out.println("OddList : " + oddList);
    }
}
