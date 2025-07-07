package problemsolving.array;

/*
 * Given a 2D Array [[4, 4], [5, 3], [1, 6], [3, 9], [2, 5], [7, 2], [8, 4], [6, 8]]
 * Sort the array based on 0th element of each sub array
 * Output: [[1, 6], [2, 5], [3, 9], [4, 4], [5, 3], [6, 8], [7, 2], [8, 4]]
 */

import java.util.Arrays;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr = {{4, 4}, {5, 3}, {1, 6}, {3, 9}, {2, 5}, {7, 4}, {9, 1}, {6, 8}};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]) + " ");
        }
    }
}
