package problemsolving;

// Recursive Programs to find Minimum and Maximum elements of array
// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array
// This is not the exact answer. The question is little modified.

import java.util.Arrays;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int[] ans = maxAndMinElement(arr);
        System.out.println(Arrays.toString(ans));
    }

    /*
     * Given an array return an array with [min, max]
     * Input: [1, 4, 3, -5, -4, 8, 6]
     * Output: [-5, 8]
     */
    static int[] maxAndMinElement(int[] arr) {
        return helper(arr, 1, new int[]{arr[0], arr[0]});
    }

    // Single Recursive function to find both max and min element in array.
    static int[] helper(int[] arr, int index, int[] ans) {
        if (index >= arr.length)
            return ans;

        if (arr[index] < ans[0])
            ans[0] = arr[index];

        if (arr[index] > ans[1])
            ans[1] = arr[index];

        return helper(arr, index + 1, ans);
    }
}
