package Arrays;

import java.util.Arrays;

/*
* Expected Input: 30, 19, 194, 66, 24, 88, 90, 73, 72, 75, 20, 200, 1, 10
* Expected Output: 484 (194, 90, 200)
*/

public class BundlingArrayWithMaxSum {
    public static void main(String[] args) {

        int[] array1 = { 30, 19, 194, 66, 24, 88, 90, 73, 72, 75, 20, 200, 1, 10 };

        System.out.println("Using Arrays Sort");
        System.out.println("--------------------");
        int bundleSize = 3;
        Arrays.sort(array1);
        int sum = 0;
        System.out.print("Bundle : ");
        for (int i = array1.length - bundleSize; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            sum += array1[i];
        }
        System.out.println("\nMaxValue : " + sum);
        System.out.println("--------------------");
        System.out.println("Using Recursion Loop");
        calculateBundle(array1, bundleSize);

    }

    private static void calculateBundle(int[] array, int bundleSize) {
        if (bundleSize <= 0 || bundleSize > array.length) {
            System.out.println("Invalid bundle size");
            return;

        }

        int[] currentBundle = new int[bundleSize];
        int[] maxBundle = new int[bundleSize];
        int[] maxSum = { Integer.MIN_VALUE };

        findBundle(array, bundleSize, 0, 0, currentBundle, maxBundle, maxSum);
        System.out.println("MaxValue : " + maxSum[0]);
        System.out.println("Bundle   : " + Arrays.toString(maxBundle));
    }

    private static void findBundle(

            int[] array,
            int bundleSize,
            int start,
            int depth,
            int[] currentBundle,
            int[] maxBundle,
            int[] maxSum) {

        if (depth == bundleSize) {
            int sum = 0;
            for (int value : currentBundle) {
                sum += value;
            }

            if (sum > maxSum[0]) {
                maxSum[0] = sum;
                System.arraycopy(
                        currentBundle, 0,
                        maxBundle, 0,
                        bundleSize);
            }
            return;
        }

        for (int i = start; i <= array.length - (bundleSize - depth); i++) {
            currentBundle[depth] = array[i];
            findBundle(
                    array,
                    bundleSize,
                    i + 1,
                    depth + 1,
                    currentBundle,
                    maxBundle,
                    maxSum);
        }
    }
}