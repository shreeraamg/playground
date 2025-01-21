package problemsolving;

// Find Peak Element
// https://leetcode.com/problems/find-peak-element

public abstract class Leetcode162 {
  public static void main(String[] args) {
    int[] nums = { 1, 3, 2, 5, 4, 8, 6, 7, 6, 9, 5, 10, 8 };
    System.out.println(findPeakElement(nums));
  }

  public static int findPeakElement(int[] nums) {
    int s = 0, e = nums.length - 1;

    while (s < e) {
      int mid = s + (e - s) / 2;

      if (nums[mid] > nums[mid + 1])
        e = mid;
      else
        s = mid + 1;
    }

    return s;
  }
}
