# Find maximum sum of a subarray of size k
# https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/

arr = [1, 4, 2, 10, 2, 3, 1, 0, 20]
k = 4


# Brute Force Approach
def max_sum_subarray_bruteforce(arr, k):
    max_sum = 0

    for i in range(0, len(arr) - k + 1):
        sum = 0
        for j in range(0, k):
            sum += arr[i + j]
        max_sum = max(max_sum, sum)

    return max_sum


# Optimal Approach
def max_sum_subarray(arr, k):
    if len(arr) < k:
        return -1

    max_sum = 0
    for i in range(0, k):
        max_sum = max_sum + arr[i]

    current_sum = max_sum
    for i in range(k, len(arr)):
        current_sum += arr[i]
        current_sum -= arr[i - k]

        max_sum = max(max_sum, current_sum)

    return max_sum


print(max_sum_subarray(arr, k))
