package problemsolving;

// Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class Leetcode34 {

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8, 8, 8 };
    int target = 8;

    int[] ans = searchRange(nums, target);

    System.out.println(Arrays.toString(ans));
  }

  public static int[] searchRange(int[] nums, int target) {
    int[] ans = new int[2];
    ans[0] = binarySearch(nums, target, true);
    ans[1] = binarySearch(nums, target, false);

    return ans;
  }

  public static int binarySearch(int[] nums, int target, boolean findFirst) {
    int s = 0, e = nums.length - 1;
    int ans = -1;

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (nums[mid] == target) {
        ans = mid;
        if (findFirst) {
          e = mid - 1;
        } else {
          s = mid + 1;
        }
      } else if (target > nums[mid]) {
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }

    return ans;

  }

  public static int binarySearch(int[] nums, int target, int start, int end) {
    int ans = -1;
    if (start > end) {
      return ans;
    }

    int mid = start + (end - start) / 2;
    if (nums[mid] == target) {
      ans = mid;
    }

    if (target < nums[mid]) {
      ans = binarySearch(nums, target, start, mid - 1);
    } else {
      ans = binarySearch(nums, target, mid + 1, end);
    }

    return ans;
  }
}
