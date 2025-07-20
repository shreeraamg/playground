arr = [13, 46, 24, 52, 20, 9]
n = len(arr)

for i in range(0, n - 1):
    swapped = False
    for j in range(0, n - i - 1):
        if arr[j] > arr[j + 1]:
            swapped = True
            arr[j], arr[j + 1] = arr[j + 1], arr[j]

    if not swapped:
        break

print(arr)
