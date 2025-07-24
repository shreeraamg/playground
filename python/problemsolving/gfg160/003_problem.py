# Reverse an Array
# https://www.geeksforgeeks.org/dsa/program-to-reverse-an-array

def reverse(arr):
    i, j = 0, len(arr) - 1

    while i < j:
        arr[i], arr[j] = arr[j], arr[i]
        i += 1
        j -= 1


arr1 = [1, 5, 3, 8, 9, 10, 7]
print("Original:", arr1)
reverse(arr1)
print("Reversed:", arr1)
