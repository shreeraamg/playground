# Merge Sorted Array (in place)
# https://leetcode.com/problems/merge-sorted-array/

def merge(nums1, m, nums2, n):
    k = m + n - 1

    while m > 0 and n > 0:
        if nums1[m - 1] > nums2[n - 1]:
            nums1[k] = nums1[m - 1]
            m -= 1
        else:
            nums1[k] = nums2[n - 1]
            n -= 1
        k -= 1

    while n > 0:
        nums1[k] = nums2[n - 1]
        n -= 1
        k -= 1


list1 = [1, 2, 3, 0, 0, 0]
list2 = [2, 5, 6]
m = 3
n = 3
merge(list1, m, list2, n)

print(list1)
