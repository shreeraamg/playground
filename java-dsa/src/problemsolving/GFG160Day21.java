package problemsolving;

// Sort and array of 0s, 1s and 2s
// https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

import java.util.Arrays;

public class GFG160Day21 {
  public static void main(String[] args) {
    int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    System.out.println("Input Array: " + Arrays.toString(arr));
    solve(arr);
    System.out.println("Output Array: " + Arrays.toString(arr));
  }

  // Dutch National Flag Algorithm (https://en.wikipedia.org/wiki/Dutch_national_flag_problem)
  static void solve(int[] arr) {
    int low = 0, mid = 0, high = arr.length - 1;

    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, low, mid);
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        swap(arr, mid, high);
        high--;
      }
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
