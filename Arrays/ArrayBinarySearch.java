package Arrays;

/*
* Expected Input: 10, 2, 8, 9, 4, 1, 5, 3, 7, 6
* BinarySearch for value 5 : 4
*/

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        int[] nums = { 10, 2, 8, 9, 4, 1, 5, 3, 7, 6 };
        System.out.println("Before Sorting: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After Sorting: " + Arrays.toString(nums));
        System.out.println("BinarySearch for value 5 : " + Arrays.binarySearch(nums, 10));
    }
}
