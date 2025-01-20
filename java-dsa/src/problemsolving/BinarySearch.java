package problemsolving;

// First Position of Element in Sorted Array
// https://www.geeksforgeeks.org/problems/binary-search-1587115620/1

public class BinarySearch {
  public static void main(String[] args) {
    int[] nums = { 2, 2, 2, 2, 2, 4, 4, 5, 6, 6, 7, 8 };
    int target = 2;

    int index = binarySearch(nums, target);
    System.out.println(index);
  }

  public static int binarySearch(int[] nums, int target) {
    int s = 0, e = nums.length - 1;
    int ans = -1;

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (nums[mid] == target) {
        ans = mid;
        e = mid - 1;
      } else if (nums[mid] > target) {
        e = mid - 1;
      } else {
        s = mid + 1;
      }
    }

    return ans;
  }
}
