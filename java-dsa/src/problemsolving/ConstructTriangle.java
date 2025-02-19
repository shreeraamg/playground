package problemsolving;

// Sum triangle from array
// https://www.geeksforgeeks.org/sum-triangle-from-array/

import java.util.Arrays;

public class ConstructTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
    }

    static void printTriangle(int[] arr) {
        if (arr.length < 1)
            return;

        printTriangle(findSum(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int[] findSum(int[] arr) {
        int[] temp = new int[arr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        return temp;
    }
}
