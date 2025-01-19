package algorithms;

// https://leetcode.com/problems/binary-search/description

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 5, 8, 10, 13, 15, 19, 20, 21 };
    int target = 5;

    int index = binarySearch(arr, target);
    System.out.println(index);
  }

  public static int binarySearch(int[] arr, int target) {
    int s = 0, e = arr.length - 1;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (target > arr[mid]) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }

    return -1;
  }
}
