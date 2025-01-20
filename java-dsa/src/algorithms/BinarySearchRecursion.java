package algorithms;

public class BinarySearchRecursion {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 5, 8, 10, 13, 15, 19, 20, 21 };
    int target = 21;

    int ans = binarySearch(arr, target, 0, arr.length - 1);
    System.out.println(ans);
  }

  public static int binarySearch(int[] arr, int target, int start, int end) {
    if (start > end) {
      return -1;
    }

    int mid = start + (end - start) / 2;
    if (arr[mid] == target) {
      return mid;
    }

    if (target > arr[mid]) {
      return binarySearch(arr, target, mid + 1, end);
    } else {
      return binarySearch(arr, target, start, mid - 1);
    }
  }

}