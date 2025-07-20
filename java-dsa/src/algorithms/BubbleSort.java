package algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        for (int i=0; i< n-1; i++) {
            boolean swapped = false;
            for (int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
