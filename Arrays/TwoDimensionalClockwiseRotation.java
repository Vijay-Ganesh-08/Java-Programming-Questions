package Arrays;

/*
* Expected No Of Rows: 3
* Expected No Of Column: 3 
* Expected Row Element: 123 456 789
* Expected Output: 741 852 963
*/

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalClockwiseRotation {
    public static int[][] turnMatrixClockwise(int[][] arr, int r, int c) {
        int[][] array = new int[r][c];
        int m = 0, n;
        for (int i = 0; i < r; i++) {
            n = 0;
            for (int j = c - 1; j >= 0; j--) {
                array[m][n] = arr[j][i];
                n++;
            }
            m++;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row: ");
        int r = sc.nextInt();
        System.out.println("Enter no of column: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.println("Enter row element: ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(turnMatrixClockwise(arr, r, c)));
        sc.close();
    }
}
