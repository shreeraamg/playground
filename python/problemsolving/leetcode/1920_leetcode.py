# Build Array from Permutation
# https://leetcode.com/problems/build-array-from-permutation/


def buildArray(nums):
    constant = len(nums) + 1  # Keep this value greater than length of array

    for i in range(len(nums)):
        a = nums[i]
        b = nums[nums[i]] % constant
        nums[i] = a + (constant * b)

    for i in range(len(nums)):
        nums[i] = nums[i] // constant

    return nums


list = [0, 2, 1, 5, 3, 4]
print(list)
buildArray(list)
print(list)
