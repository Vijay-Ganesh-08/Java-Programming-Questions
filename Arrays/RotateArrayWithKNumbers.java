package Arrays;

/*
* Expected Input: 1, 2, 3, 4, 5, 6
* Expected Output: 5 6 1 2 3 4
*/

public class RotateArrayWithKNumbers {
    public static void rotateclockwise(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return;
        }

        int n = arr.length;

        // rotate right by one position
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // recursive call for k - 1
        rotateclockwise(arr, k - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;

        rotateclockwise(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
