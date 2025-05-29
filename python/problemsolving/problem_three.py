# Maximum Subarray Sum - Kadane's Algorithm
# https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

def max_subarray_sum(arr):
    current_sum = arr[0]
    max_sum = arr[0]

    for i in range(1, len(arr)):
        current_sum = max(current_sum + arr[i], arr[i])
        max_sum = max(current_sum, max_sum)

    return max_sum


arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
print(max_subarray_sum(arr))
