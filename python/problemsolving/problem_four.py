# Move all zeros to end of array
# https://www.geeksforgeeks.org/move-zeroes-end-array/

def move_zeroes(arr):
    pos = 0
    for i in range(0, len(arr)):
        if arr[i] != 0:
            arr[i], arr[pos] = arr[pos], arr[i]
            pos += 1


arr = [1, 2, 0, 4, 3, 0, 5, 0]
print(arr)
move_zeroes(arr)
print(arr)
