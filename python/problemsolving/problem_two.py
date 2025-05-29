# Sort an array of 0s, 1s and 2s
# Dutch National Flag Algorithm
# https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

arr = [0, 1, 2, 0, 0, 2, 1, 0, 1, 1, 2]

low, mid, high = 0, 0, len(arr) - 1

while mid <= high:
    if arr[mid] == 0:
        arr[mid], arr[low] = arr[low], arr[mid]
        mid += 1
        low += 1
    elif arr[mid] == 1:
        mid += 1
    else:
        arr[mid], arr[high] = arr[high], arr[mid]
        high -= 1

print(arr)
