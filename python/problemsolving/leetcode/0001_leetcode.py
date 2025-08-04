# Two Sum
# https://leetcode.com/problems/two-sum/


def twoSum_bruteForce(nums, target):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]


def twoSum_optimal(nums, target):
    numsMap = {}

    for i in range(len(nums)):
        diff = target - nums[i]
        if diff in numsMap:
            return [numsMap[diff], i]
        numsMap[nums[i]] = i

    return


nums = [2, 7, 11, 15]

print(twoSum_optimal(nums, 26))
